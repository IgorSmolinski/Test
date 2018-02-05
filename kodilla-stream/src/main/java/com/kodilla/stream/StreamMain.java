package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lamdba.Executor;
import com.kodilla.stream.lamdba.ExpressionExecutor;
import com.kodilla.stream.lamdba.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("Example text to print using lambda expression");
        processor.execute(codeToExecute);

        System.out.println("Calculating using lambda expression");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10 ,5 ,(a,b) -> a + b);
        expressionExecutor.executeExpression(10 ,5 ,(a,b) -> a - b);
        expressionExecutor.executeExpression(10 ,5 ,(a,b) -> a * b);
        expressionExecutor.executeExpression(10 ,5 ,(a,b) -> a / b);

        System.out.println("Calculate using reference method");
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subAfromB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Poem to Myself", (p)->p.toUpperCase());
        poemBeautifier.beautify("Poem to Myself", (p)->p.toLowerCase());
        poemBeautifier.beautify("Poem to Myself", (p)-> p.substring(0,5));
        poemBeautifier.beautify("Poem to Myself", (p)-> new StringBuilder().append("***").append(p).append("***").toString());
        poemBeautifier.beautify("Poem to Myself", (p)-> new StringBuilder(p).reverse().toString());

    }
}