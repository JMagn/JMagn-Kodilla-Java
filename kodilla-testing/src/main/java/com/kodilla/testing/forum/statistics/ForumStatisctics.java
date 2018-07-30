package com.kodilla.testing.forum.statistics;

public class ForumStatisctics {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNumber = statistics.usersNames().size();
        this.postsNumber = statistics.postsCount();
        this.commentsNumber = statistics.commentsCount();
        if (usersNumber > 0) {
            this.postsPerUser = (double)postsNumber / usersNumber;
            this.commentsPerUser = (double)commentsNumber / usersNumber;
        }
        if (postsNumber > 0) {
            this.commentsPerPost = (double)commentsNumber / postsNumber;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of post: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Posts per user: " + postsPerUser);
        System.out.println("Comments per user: " + commentsPerUser);
        System.out.println("Comments per post: " + commentsPerPost);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
