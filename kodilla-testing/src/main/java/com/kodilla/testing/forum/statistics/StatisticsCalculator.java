package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    int usersAmount;
    int postsAmount;
    int commentsAmount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();
        if (usersAmount != 0) {
            averagePostsPerUser = (double) postsAmount / usersAmount;
        } else {
            averagePostsPerUser = 0.0;
        }
        if (usersAmount != 0) {
            averageCommentsPerUser = (double) commentsAmount / usersAmount;
        } else {
            averageCommentsPerUser = 0.0;
        }
        if (postsAmount != 0) {
            averageCommentsPerPost = (double) commentsAmount / postsAmount;
        } else {
            averageCommentsPerPost = 0.0;
        }
    }

    public void showStatistics() {
        System.out.println("Users: " + usersAmount + "\nPosts: " + postsAmount + "\nComments: " + commentsAmount
                + "\nPosts per User: " + averagePostsPerUser + "\nComments per User: " + averageCommentsPerUser
                + "\nComments per Post: " + averageCommentsPerPost);
    }
}
