package com.kodilla.testing.shape;

import static java.lang.Math.pow;

class Square implements Shape{
    String name = "Squere";
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName(){
     return name;
    }

    @Override
    public double getField(){
        return pow(a,2);
    }


    public double getA() {
        return a;
    }

    public void setName(String name) {
        this.name = name;
    }
}


