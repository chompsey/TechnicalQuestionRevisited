package com.company;

public class ArrayGasChallenge {

    public void FeedMeTheGas(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Station " + (i+1) + " : " + TripFomStation(i,arr) + '\n');
        }
    }

    private String TripFomStation(int station, String[] arr){
        Integer gas = 0;
        for (int i = station; i < arr.length; i++) {
            String[] trip = arr[i].split(":");
            gas += Integer.parseInt(trip[0]);
            gas -= Integer.parseInt(trip[1]);
            if ( gas < 0){
                return "Impossible";
            }
        }
        return Integer.toString(gas);
    }
}
