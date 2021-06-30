package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> result = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthdate().until(LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getAddedPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("Number of map elements " + result.size());
        result.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
