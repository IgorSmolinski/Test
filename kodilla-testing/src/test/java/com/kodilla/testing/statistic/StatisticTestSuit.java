package com.kodilla.testing.statistic;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuit {

    static int testcounter=0;

    @BeforeClass
    public static void beforeAllTest(){ System.out.println("Start all tests");};

    @AfterClass
    public static void afterAllTests(){
        System.out.println("End all " + testcounter + " tests");
    }

    @Before
    public void beforeEveryTest(){
        testcounter++;
        System.out.println("Starting test nr. " + testcounter);
    }

    @After
    public void afterEveryTest(){
        System.out.println("End test nr. " + testcounter);
    }


    @Test
    public void testOneHundredUsers(){
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> somelist = new ArrayList<String>();
        int i=0;
        do {
            somelist.add("a" + i);
            i++;
        }
        while (i!=100);
        //Given
        when(stats.usersNames()).thenReturn(somelist);
        when(stats.commentsCount()).thenReturn(100);
        when(stats.postsCount()).thenReturn(50);
        //When
        StatisticsCounter statscounter = new StatisticsCounter(stats);
        statscounter.calculateAdvStatistics(stats);
        statscounter.showStatics();
        //Then
        Assert.assertEquals(100, statscounter.getNumbersOfUsers());
    }

    @Test
    public void testZeroUsersPostAndComments(){
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> somelist = new ArrayList<String>();

        when(stats.usersNames()).thenReturn(somelist);
        when(stats.commentsCount()).thenReturn(0);
        when(stats.postsCount()).thenReturn(0);
        //When
        StatisticsCounter statscounter = new StatisticsCounter(stats);
        statscounter.calculateAdvStatistics(stats);
        statscounter.showStatics();
        //Then
        Assert.assertEquals(0, statscounter.getNumbersOfUsers());
        Assert.assertEquals(0,statscounter.getNumberOfPosts());
        Assert.assertEquals(0,statscounter.getNumbersOfComments());

    }

    @Test
    public void test1000Post(){
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> somelist = new ArrayList<String>();
        int i=0;
        do {
            somelist.add("a" + i);
            i++;
        }
        while (i!=50);
        when(stats.usersNames()).thenReturn(somelist);
        when(stats.postsCount()).thenReturn(1000);
        when(stats.commentsCount()).thenReturn(200);
        //when
        StatisticsCounter statscounter = new StatisticsCounter(stats);
        statscounter.calculateAdvStatistics(stats);
        statscounter.showStatics();
        //
        Assert.assertEquals(1000, stats.postsCount());
    }

    @Test
    public void testPostsBiggerThenComments(){
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> somelist = new ArrayList<String>();
        int i=0;
        do {
            somelist.add("a" + i);
            i++;
        }
        while (i!=50);
        when(stats.usersNames()).thenReturn(somelist);
        when(stats.postsCount()).thenReturn(1000);
        when(stats.commentsCount()).thenReturn(200);
        //when
        StatisticsCounter statscounter = new StatisticsCounter(stats);
        statscounter.calculateAdvStatistics(stats);
        statscounter.showStatics();
        //
        Assert.assertTrue(statscounter.getNumberOfPosts()>statscounter.getNumbersOfComments());
    }
    @Test
    public void testCommentsBiggerThenPosts(){
        //Given
        Statistics stats = mock(Statistics.class);
        List<String> somelist = new ArrayList<String>();
        int i=0;
        do {
            somelist.add("a" + i);
            i++;
        }
        while (i!=50);
        when(stats.usersNames()).thenReturn(somelist);
        when(stats.postsCount()).thenReturn(500);
        when(stats.commentsCount()).thenReturn(800);
        //when
        StatisticsCounter statscounter = new StatisticsCounter(stats);
        statscounter.calculateAdvStatistics(stats);
        statscounter.showStatics();
        //
        Assert.assertTrue(statscounter.getNumberOfPosts()<statscounter.getNumbersOfComments());
    }
}
