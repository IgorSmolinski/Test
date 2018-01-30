package com.kodilla.testing.shape;


public class Triangel implements Shape{
    private String name = "Triangel";
    private double a,h;

    public Triangel(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return a*1/2*h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }
}
