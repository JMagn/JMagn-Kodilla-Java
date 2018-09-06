package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike");
        User john = new YGeneration("John");
        User catherine = new ZGeneration("Catherine");
        //When
        String mikesPubisher = mike.sharePost();
        System.out.println("Mike's publisher: " + mikesPubisher);
        String johnsPublisher = john.sharePost();
        System.out.println("John's publisher: " + johnsPublisher);
        String catherinesPublisher = catherine.sharePost();
        System.out.println("Catherine's publisher: " + catherinesPublisher);
        //Then
        Assert.assertEquals("Facebook", mikesPubisher);
        Assert.assertEquals("Twitter", johnsPublisher);
        Assert.assertEquals("Snapchat", catherinesPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike");
        //When
        String mikesPubisher = mike.sharePost();
        System.out.println("Mike's publisher: " + mikesPubisher);
        mike.setPublisher(new TwitterPublisher());
        mikesPubisher = mike.sharePost();
        System.out.println("Mike's new publisher: " + mikesPubisher);
        //Then
        Assert.assertEquals("Twitter", mikesPubisher);
    }
}
