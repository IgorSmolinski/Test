package com.kodilla.testing;


import com.kodilla.testing.user.SimpleUser;

import static com.kodilla.testing.calculator.Calc.add;
import static com.kodilla.testing.calculator.Calc.substract;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        int result2 = add(2, 3);

        if (result2==5){
            System.out.println("Adding test complete, everything is O.K.");
        }
        else {
            System.out.println("Adding test error");
        }

        result2 = substract(2,3);

        if (result2==-1){
            System.out.println("Substraction test complete, everything is O.K.");
        }
        else {
            System.out.println("Substraction test error");
        }

        }

    }
