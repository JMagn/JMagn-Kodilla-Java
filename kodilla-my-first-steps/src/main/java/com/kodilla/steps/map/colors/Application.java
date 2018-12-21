package com.kodilla.steps.map.colors;

import java.util.HashMap;
import java.util.Map;

public class Application {

    private static Map<Integer, String> initMyFavoriteColors() {

        Map<Integer,String> myFavoriteColors = new HashMap<Integer,String>();

        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");

        return myFavoriteColors;
    }

    private static Map<Integer, String> initMyFriendsFavoriteColors() {

        Map<Integer,String> myFriendsFavoriteColors = new HashMap <Integer,String> ();

        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");

        return myFriendsFavoriteColors;
    }

    public static void main (String[] args) {

        OurFavoriteColors ourFavoriteColors = new OurFavoriteColors();
        ourFavoriteColors.addMyColors(initMyFavoriteColors());
        ourFavoriteColors.addMyFriendsColors(initMyFriendsFavoriteColors());
        ourFavoriteColors.print();
    }
}
