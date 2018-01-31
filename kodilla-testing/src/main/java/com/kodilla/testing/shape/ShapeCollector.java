package com.kodilla.testing.shape;


import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
        System.out.println("Element on the list:" + shapes.size());
    }

    public boolean removeFigure(Shape shape){
        return shapes.remove(shape);

    }

    public Shape getFigure(int n){

        Shape example=null;

        if (n>=0 && n<=shapes.size()) {
            example = shapes.get(n);
            System.out.println(example.getShapeName());
            System.out.println(example.getField());
        }

        return example;
    }

    public void showFigures(){
        for (Shape temp : shapes){
             System.out.println(temp.getShapeName());
            System.out.println(temp.getField());
        }

    }


    public int getListQuantity(){
        return shapes.size();
    }



}
