package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testUsers() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("Adam");
        }
        int posts = 10;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatisctics forumStatisctics = new ForumStatisctics();

        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(100, forumStatisctics.getUsersNumber());
    }

    @Test
    public void testNoUsers() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatisctics.getUsersNumber());
    }

    @Test
    public void testPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Adam");
        int posts = 1000;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatisctics forumStatisctics = new ForumStatisctics();

        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(1000, forumStatisctics.getPostsNumber());
    }

    @Test
    public void testMorePostsThanComments() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Adam");
        int posts = 1000;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatisctics forumStatisctics = new ForumStatisctics();

        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertTrue(forumStatisctics.getPostsNumber() > forumStatisctics.getCommentsNumber());
    }

    @Test
    public void testLessPostsThanComments() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Adam");
        int posts = 10;
        int comments = 1000;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatisctics forumStatisctics = new ForumStatisctics();

        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertFalse(forumStatisctics.getPostsNumber() > forumStatisctics.getCommentsNumber());
    }

    @Test
    public void testNoPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatisctics forumStatisctics = new ForumStatisctics();
        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatisctics.getPostsNumber());
    }

    @Test
    public void testShowStatistics() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("Adam");
        }
        int posts = 50;
        int comments = 200;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatisctics forumStatisctics = new ForumStatisctics();

        // When
        forumStatisctics.calculateAdvStatistics(statisticsMock);

        // Then
        forumStatisctics.showStatistics();
    }
}
