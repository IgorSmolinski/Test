package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangel;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int  testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Test
    public void testAddShape(){
        //Given
         Circle testCircle = new Circle(5);
         ShapeCollector newShape = new ShapeCollector();

        //When
        newShape.addFigure(testCircle);
        int result= newShape.getListQuantity();

        //Then
        Assert.assertEquals(1,result);
    }

    @Test
    public void testGetShape(){
        //Given
        Triangel testTriangle = new Triangel(3,6);
        ShapeCollector newShape = new ShapeCollector();
        newShape.addFigure(testTriangle);

        //When
        ShapeCollector testingShape = newShape.getFigure(0);

        //Then
        Assert.assertEquals(newShape, testingShape);
    }

    @Test
    public void testRemoveNotExistingShape(){
        //Given
        Square testSquare = new Square(4);
        ShapeCollector newShape = new ShapeCollector();

        //When
        boolean result = newShape.removeFigure(testSquare);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveShape(){
        //Given
        Circle newCircle = new Circle(2);
        ShapeCollector newShape = new ShapeCollector();
        newShape.addFigure(newCircle);

        //When
        boolean result = newShape.removeFigure(newCircle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, newShape.getListQuantity());
    }

    @Test
    public void testShowingShape(){
        //Given
        Square newSquare = new Square(2);
        ShapeCollector newShape = new ShapeCollector();

        //When
        Shape testShape = (Shape) newShape;
        String shapeName= testShape.getShapeName();
        double shapeField=testShape.getField();

        //Then
        Assert.assertEquals("Squere", shapeName);
        Assert.assertEquals(4, shapeField, 0.1);

    }
}
