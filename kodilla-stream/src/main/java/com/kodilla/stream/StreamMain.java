package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lamdba.Executor;
import com.kodilla.stream.lamdba.ExpressionExecutor;
import com.kodilla.stream.lamdba.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forumlist = new Forum();
        Map<Integer, ForumUser> resultMap=forumlist.getList().stream()
                .filter(user->user.getSex()=='M')
                .filter(user->user.getBirthday().isBefore(LocalDate.of(1998,1,7)))
                .filter(user->user.getQuantityOfPosts()>1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        resultMap.entrySet().stream()
                .map(entry->entry.getKey()+ ":" + entry.getValue().getUserName())
                .forEach(System.out::println);


//Poprzednia część zadań


        System.out.println("\n*********************************");
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