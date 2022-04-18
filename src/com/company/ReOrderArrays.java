package com.company;

public class ReOrderArrays {
    public String ReturnReorderedArray(int[] arr){
        String front = "";
        String back = "";
        for(int i = 0; i < arr.length; i++){
            if (i < arr[0]){
                back += arr[i];
            }
            if (i >= arr[0]){
                front += arr[i];
            }
        }
        return front + back;
    }
}
