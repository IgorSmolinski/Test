package com.kodilla.testing.shape;



class Square implements Shape{
    String name = "Squere";
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName(){
     return "SMTH";
    }

    @Override
    public double getField(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }
}
