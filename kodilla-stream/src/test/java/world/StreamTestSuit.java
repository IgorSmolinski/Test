package world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

public class StreamTestSuit {
    static int counter = 0;

    @Before
    public void beforeEveryTest() {
        counter++;
        System.out.println("Under process test nr. " + counter);
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting all tests");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Under process test nr. " + counter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("End test nr. " + counter);
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        BigDecimal polishPeople = BigDecimal.valueOf(890780967);
        BigDecimal germanPeople = BigDecimal.valueOf(8233213267L);
        BigDecimal czechPeople = BigDecimal.valueOf(1212312);
        BigDecimal hollandPeople = BigDecimal.valueOf(89078231223167L);


        Country polska = new Country("Polska", polishPeople);
        Country niemcy = new Country("Niemcy", germanPeople);
        Country czechy = new Country("Czechy", czechPeople);
        Country holandia = new Country("Holandia", hollandPeople);
        Continent europa = new Continent("Europa", new HashSet<>(Arrays.asList(polska, niemcy)));
        Continent azja = new Continent("Azja", new HashSet<>(Arrays.asList(czechy, holandia)));
        World underWorld = new World(Arrays.asList(europa, azja));
        BigDecimal allPeople = polishPeople.add(germanPeople).add(czechPeople).add(hollandPeople);
        //When
        BigDecimal actual = underWorld.getPeopleQuantity();
        //then
        Assert.assertEquals(allPeople, actual);


    }

}
