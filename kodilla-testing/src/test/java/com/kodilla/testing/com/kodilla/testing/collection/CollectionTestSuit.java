package com.kodilla.testing.com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExtreminator;
import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuit {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testingList = new ArrayList<>();
        OddNumbersExtreminator newOne = new OddNumbersExtreminator(testingList);
        //When
        boolean result = newOne.getList().isEmpty();
        System.out.println("Testing is ArrayList is empty.");
        //Then
        Assert.assertEquals(true, result);
    }

    @Test
    public void testOddNumbersExteminatorNormal(){
        //Given
        ArrayList<Integer> testingList = new ArrayList<>();
        ArrayList<Integer> testingOddList = new ArrayList<>();
        testingList.add(1);
        testingList.add(2);
        testingList.add(3);
        testingList.add(4);
        testingList.add(5);
        testingList.add(6);
        testingList.add(7);
        testingList.add(8);
        testingOddList.add(2);
        testingOddList.add(4);
        testingOddList.add(6);
        testingOddList.add(8);
        OddNumbersExtreminator newOne = new OddNumbersExtreminator(testingList);
        //When
        ArrayList<Integer> example = newOne.extreminate(testingList);

        System.out.println("Testing if exterminate method from Class OddNumbersExterminator working properly");
        //Then
        Assert.assertEquals(testingOddList, example);
    }

}

