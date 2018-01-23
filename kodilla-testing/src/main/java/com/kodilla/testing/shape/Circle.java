package com.kodilla.testing.shape;

public class Circle implements Shape{
    String name="circle";
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getField() {
        return 0;
    }

    @Override
    public String getShapeName(){
        return "SMTH";
    }

    public Circle(String name) {
        this.name = name;
    }

    public double getR() {
        return r;
    }
}
