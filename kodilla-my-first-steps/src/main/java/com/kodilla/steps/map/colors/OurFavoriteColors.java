package com.kodilla.steps.map.colors;

import java.util.HashMap;
import java.util.Map;

class OurFavoriteColors {

    private Map<Integer, String> jointMap;

    public OurFavoriteColors() {
        this.jointMap = new HashMap<Integer, String>();
    }

    public void addMyColors(Map<Integer, String> myColors) {
        for (Map.Entry<Integer, String> x : myColors.entrySet()) {
            jointMap.put(x.getKey(), x.getValue());
        }
    }
    // lepsza wersja:
    public void addMyFriendsColors(Map<Integer, String> myFriendsColors) {
        jointMap.putAll(myFriendsColors);
    }

    public void print() {
        System.out.println("Our favourite colours are:");
        for (Map.Entry<Integer, String> x : jointMap.entrySet()) {
            System.out.println(x.getValue());
        }
    }
}
