package com.kodilla.testing.shape;


public class Triangel implements Shape{
    String name = "Triangel";
    double a,h;

    public Triangel(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getShapeName() {
        return getName();
    }

    @Override
    public double getField() {
        return a*1/2*h;
    }
}
