package com.kodilla.testing.shape;


import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();
    static int listcounter = 0;

    public void addFigure(Shape shape){
        shapes.add(shape);
        listcounter++;

        System.out.println("Element on the list:" + listcounter );
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result=true;
        }
        return result;

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

    public void showFigures(){                       //  Żeby przetestować tą metodę chciałem skorzystać z Klasy OutputCapture
        for (Shape temp : shapes){                  //  Nie udało mi się jej zaimportować.
             System.out.println(temp.getShapeName());
            System.out.println(temp.getField());
        }

    }


    public int getListQuantity(){
        return shapes.size();
    }



}
