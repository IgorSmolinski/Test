package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id, quantityOfPosts;
    private String userName;
    private char sex;
    private LocalDate birthday;

    public ForumUser(int id, int quantityOfPosts, String userName, char sex, int year, int month, int day) {
        this.id = id;
        this.quantityOfPosts = quantityOfPosts;
        this.userName = userName;
        this.sex = sex;
        this.birthday = LocalDate.of(year, month, day);
    }

    public int getId() {
        return id;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
