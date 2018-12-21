package com.kodilla.steps.map;

import java.util.*;

class Application {

    private static final String AVERAGE = "%s average grade is: %.2f";

    private static int random() {
        return new Random().nextInt(6) + 1;
    }

    private static List<Integer> initList() {
        List<Integer> grade = new ArrayList<Integer>();

        for (int i = 0; i < random(); i++) {
            grade.add(random());
        }
        return grade;
    }

    private static Map<Student, Grades> initMap() {
        Student student1 = new Student("Anna", "Nowak", "99071712547");
        Student student2 = new Student("Jan", "Kowalski", "99123025698");
        Student student3 = new Student("Alicja", "Milska", "98010212793");

        Map<Student, Grades> studentGrades = new HashMap<Student, Grades>();

        studentGrades.put(student1, new Grades(initList()));
        studentGrades.put(student2, new Grades(initList()));
        studentGrades.put(student3, new Grades(initList()));

        return studentGrades;
    }

    public static void printAverages (Map<Student, Grades> map) {
        for (Map.Entry<Student, Grades> entry : map.entrySet()) {
            System.out.println(String.format(AVERAGE, entry.getKey(), entry.getValue().avg()));
        }
    }

    public static void getGrades (Map<Student, Grades> map) {
        for (Map.Entry<Student, Grades> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main (String[] args) throws java.lang.Exception {

        Map<Student, Grades> mapStGr = initMap();

        getGrades(mapStGr);
        printAverages(mapStGr);
    }
}
