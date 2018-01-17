package com.kodilla.testing.calculator;

public class Calc {
    private int a,b;

    public Calc(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int substract(int a, int b){
        return a-b;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
