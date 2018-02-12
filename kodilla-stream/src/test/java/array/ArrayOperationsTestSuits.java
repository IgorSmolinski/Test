package array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuits {

@Test
    public void testGetAverage(){
    //Given

        int tempArray[] = IntStream.range(0,20).toArray();
        //int temporarysum = IntStream.range(0,20).sum();
        //System.out.println(temporarysum);
        int tempArray2[] = {2,4,5,6,8};

        //When
        double averageTemp = ArrayOperations.getArray(tempArray);
        double averageTemp2 = ArrayOperations.getArray(tempArray2);

        //Then
       // Assert.assertEquals();
        Assert.assertEquals(5, averageTemp2, 0.0);
        Assert.assertEquals(9.5,averageTemp,0.0);
    }
}
