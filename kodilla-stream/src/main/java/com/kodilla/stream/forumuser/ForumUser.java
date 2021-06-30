package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthdate;
    private final int addedPostCount;

    public ForumUser(final int userId, final String username, final char sex,
                     final LocalDate birthdate, final int addedPostCount) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthdate = birthdate;
        this.addedPostCount = addedPostCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAddedPostCount() {
        return addedPostCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", addedPostCount=" + addedPostCount +
                '}';
    }
}
