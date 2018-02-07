package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, 30, "Ildefons", 'M', 1983, 07, 01));
        forumUserList.add(new ForumUser(2, 15, "Benek", 'M', 2013, 05, 12));
        forumUserList.add(new ForumUser(3, 1, "Adromeda", 'W', 1956, 11, 30));
        forumUserList.add(new ForumUser(4, 0, "Pooky", 'W', 1943, 10, 15));
        forumUserList.add(new ForumUser(5, 56, "Belzebub", 'M', 1967, 12, 12));
        forumUserList.add(new ForumUser(6, 123, "Horton", 'M', 1999, 04, 17));
        forumUserList.add(new ForumUser(7, 564, "Jagos", 'W', 1942, 01, 19));
        forumUserList.add(new ForumUser(8, 45, "Wielka", 'W', 1989, 06, 24));
        forumUserList.add(new ForumUser(9, 64, "Pablo", 'M', 1985, 05, 31));
        forumUserList.add(new ForumUser(10, 80, "Yukanon", 'M', 1923, 01, 11));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);

    }
}
