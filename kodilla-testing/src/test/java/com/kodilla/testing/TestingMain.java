package com.kodilla.testing;


import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calc;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calc newCalculator = new Calc(2,3);

        int result2 = newCalculator.add(newCalculator.getA(), newCalculator.getB());

        if (result2==5){
            System.out.println("Adding test complete, everything is O.K.");
        }
        else {
            System.out.println("Adding test error");
        }

        result2 = newCalculator.substract(newCalculator.getA(), newCalculator.getB());

        if (result2==-1){
            System.out.println("Substraction test complete, everything is O.K.");
        }
        else {
            System.out.println("Substraction test error");
        }

        }

    }
