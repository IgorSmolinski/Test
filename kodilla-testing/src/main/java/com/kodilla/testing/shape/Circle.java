package com.kodilla.testing.shape;

import static java.lang.Math.*;

public class Circle implements Shape{
    String name="circle";
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getField() {
        return Math.PI*Math.pow(r, 2);
    }

    @Override
    public String getShapeName(){
        return name;
    }

    public double getR() {
        return r;
    }
}
