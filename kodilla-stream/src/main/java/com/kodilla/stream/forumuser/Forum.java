package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "User1", 'F', LocalDate.of(2002,8,3),19));
        userList.add(new ForumUser(2, "User2", 'M', LocalDate.of(1989,7,9),3));
        userList.add(new ForumUser(3, "User3", 'M', LocalDate.of(1985,6,18),0));
        userList.add(new ForumUser(4, "User4", 'M', LocalDate.of(2001,7,25),25));
        userList.add(new ForumUser(5, "User5", 'F', LocalDate.of(1984,10,1),0));
        userList.add(new ForumUser(6, "User6", 'M', LocalDate.of(2001,5,6),6));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
