package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String somethinh, PoemDecorator poemDecorator){
        String temp = poemDecorator.decorate(somethinh);
        System.out.println(temp);
    }
}
