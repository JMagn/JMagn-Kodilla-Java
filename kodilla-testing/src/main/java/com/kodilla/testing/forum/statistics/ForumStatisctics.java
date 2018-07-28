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
        if (usersNumber > 0) {
            this.postsNumber = statistics.postsCount();
            this.postsPerUser = (double)postsNumber / usersNumber;
        }
        if (usersNumber > 0 && postsNumber > 0) {
            this.commentsNumber = statistics.commentsCount();
            this.commentsPerUser = commentsNumber / (double)usersNumber;
            this.commentsPerPost = commentsNumber / postsNumber;
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
}
