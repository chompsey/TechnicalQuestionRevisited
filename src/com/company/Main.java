package com.company;

//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import com.google.gson.stream.JsonReader;
//import com.google.gson.stream.JsonToken;

//import java.io.*;
//import java.net.URL;
//import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.print("******Re-ordered Array*******");
        System.out.print('\n');
        ReOrderArrays reOrderArrays = new ReOrderArrays();
        System.out.print(reOrderArrays.ReturnReorderedArray(new int[]{2,3,1,7,5,13}));
        System.out.print('\n');
        System.out.print("******Gas Challenge*******");
        System.out.print('\n');
        ArrayGasChallenge arrayGasChallenge = new ArrayGasChallenge();
        arrayGasChallenge.FeedMeTheGas(new String[]{"3:1", "1:1", "2:1", "1:2"});
        System.out.print("******JSON Consumption*******");
        System.out.print('\n');
        API api = new API();
        ArrayList<CountryPopulation> countries = api.GetCountryPopulations();
        System.out.print(countries);
    }


}
