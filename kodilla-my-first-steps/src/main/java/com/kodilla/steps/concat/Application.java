package com.kodilla.steps.concat;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static List<String> initCompanies() {

        List<String> companies = new ArrayList<String>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        return companies;
    }

    private static String string(List<String> list) {
        String ret = "";
        for (int i = 0; i < (list.size() - 1); i++) {
            ret = ret + list.get(i) + ", ";
        }
        return ret + (list.get(list.size() - 1));
    }

    private static void print() {
        System.out.println(string(initCompanies()));
    }

    public static void main (String[] args) {

        print();
    }
}
