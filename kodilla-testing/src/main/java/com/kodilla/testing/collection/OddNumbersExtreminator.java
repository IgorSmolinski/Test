package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExtreminator {
    ArrayList<Integer> list;

    public OddNumbersExtreminator(ArrayList<Integer> listSample){
        this.list=listSample;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public  ArrayList<Integer> extreminate(ArrayList<Integer> numbers){   // w tym miejscu chciałem aby parametrem metody była this.list
                                                                          // public  ArrayList<Integer> extreminate(ArrayList<Integer> this.list)
        ArrayList<Integer> oddNumbersList = new ArrayList<>();            // jednakże zgłaszał mi błąd.

        for (Integer odds: numbers ){
            if (odds%2 == 0){
                oddNumbersList.add(odds);
            }
        }
        return oddNumbersList;
    }
}
