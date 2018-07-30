package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void test1000PostsPer100Users() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("Adam");
        }
        int posts = 1000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(10, forumStatisctics.getPostsPerUser(), 0.00001);
        Assert.assertEquals(users.size(), forumStatisctics.getUsersNumber());
    }

    @Test
    public void test0PostsPer100Users() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(0, forumStatisctics.getPostsPerUser(), 0.00001);
    }

    @Test
    public void test1000PostsPer0Users() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(0, forumStatisctics.getPostsPerUser(), 0.00001);
    }

    @Test
    public void test0CommentsPer100Users() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("Adam");
        }
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(0, forumStatisctics.getCommentsPerUser(), 0.00001);
    }

    @Test
    public void testCommentsPerPostMoreComments() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        int posts = 10;
        int comments = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertTrue(forumStatisctics.getPostsNumber() < forumStatisctics.getCommentsNumber());
        Assert.assertEquals(100, forumStatisctics.getCommentsPerPost(), 0.00001);
    }

    @Test
    public void testCommentsPerPostMorePosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        int posts = 1000;
        int comments = 10;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertTrue(forumStatisctics.getPostsNumber() > forumStatisctics.getCommentsNumber());
        Assert.assertEquals(0.01, forumStatisctics.getCommentsPerPost(), 0.00001);
    }

    @Test
    public void testShowStatistics() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("Adam");
        }
        int posts = 3;
        int comments = 7;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        // Then
        forumStatisctics.showStatistics();
    }
}
