package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExtreminator {

    public static  ArrayList<Integer> exterminate (ArrayList<Integer> numbers){

        ArrayList<Integer> oddNumbersList = new ArrayList<>();

        for (Integer odds: numbers ){
            if (odds%2 == 0){
                oddNumbersList.add(odds);
            }
        }
        return  oddNumbersList;
    }
}
