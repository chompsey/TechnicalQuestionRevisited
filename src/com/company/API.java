package com.company;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class API {

    public ArrayList<CountryPopulation> GetCountryPopulations() {
        try {
            String urlString = "https://datausa.io/api/data?drilldowns=Nation&measures=Population";
            URL url = new URL(urlString);

            //make connection to the rest service
            URLConnection urlconnection = url.openConnection();

            // POST
            urlconnection.setDoOutput(true);
            urlconnection.setAllowUserInteraction(false);

            //get result
            BufferedReader br = new BufferedReader(new InputStreamReader(urlconnection
                    .getInputStream()));
            String json = br.readLine();

            JsonElement jsonString = JsonParser.parseString(json);
            JsonObject obj = jsonString.getAsJsonObject();
            JsonReader jsonReader = new JsonReader(new StringReader(json));

            JsonArray nations = obj.get("data").getAsJsonArray();
            ArrayList<CountryPopulation> countries = new ArrayList<>();
            for (JsonElement nation : nations){
                JsonObject nationObj = nation.getAsJsonObject();
                countries.add(new CountryPopulation(nationObj.get("ID Nation").getAsString(), nationObj.get("Nation").getAsString(),nationObj.get("ID Year").getAsInt(), nationObj.get("Year").getAsInt(),nationObj.get("Population").getAsInt(), nationObj.get("Slug Nation").getAsString()));
            }

            br.close();
            return countries;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
