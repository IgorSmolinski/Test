package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;


public class StatisticsCounter  {
    private int numberOfPosts, numbersOfUsers,numbersOfComments;
    private double averageCommentPerPost, averageCommentPerUser, averagePostPerUser;

    Statistics stats;

public StatisticsCounter(Statistics stats){
    this.stats = stats;

}

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getNumbersOfComments() {
        return numbersOfComments;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public void setNumbersOfUsers(int numbersOfUsers) {
        this.numbersOfUsers = numbersOfUsers;
    }

    public void setNumbersOfComments(int numbersOfComments) {
        this.numbersOfComments = numbersOfComments;
    }

    public void setAverageCommentPerPost(double averageCommentPerPost) {
        this.averageCommentPerPost = averageCommentPerPost;
    }

    public void setAverageCommentPerUser(double averageCommentPerUser) {
        this.averageCommentPerUser = averageCommentPerUser;
    }

    public void setAveragePostPerUser(double averagePostPerUser) {
        this.averagePostPerUser = averagePostPerUser;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        setNumberOfPosts(statistics.postsCount());
        setNumbersOfComments(statistics.commentsCount());
        setNumbersOfUsers(statistics.usersNames().size());

        if (statistics.usersNames().size() == 0) {
            setAverageCommentPerUser(0);
        }
        else {
            setAverageCommentPerUser((double)statistics.commentsCount() / (double)statistics.usersNames().size());
        }



        if (statistics.postsCount() == 0) {
            setAverageCommentPerPost(0);
            setAveragePostPerUser(0);
            }
            else {
            setAverageCommentPerPost((double)statistics.commentsCount() / (double)statistics.postsCount());
            setAveragePostPerUser((double)statistics.postsCount() / (double)statistics.usersNames().size());

        }

    }
    public void showStatics(){
    System.out.println("Number of users: " + numbersOfUsers);
    System.out.println("Number of posts: " + numberOfPosts);
    System.out.println("Number of comments: " + numbersOfComments);
    System.out.println("Average Post per User: " + averagePostPerUser);
    System.out.println("Average Comment per User: " + averageCommentPerUser);
    System.out.println("Average Comment per Post: " + averageCommentPerPost);
    }

}
