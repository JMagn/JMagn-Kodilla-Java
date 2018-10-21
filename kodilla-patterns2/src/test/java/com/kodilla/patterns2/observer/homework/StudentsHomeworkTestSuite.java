package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentsHomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Task task201 = new Task("20.1.", "Wzorzec Fasada");
        Task task202 = new Task("20.2.", "Wzorzec Dekorator");
        Task task203 = new Task("20.3.", "Programowanie aspektowe w Spring Boot");
        Task task204 = new Task("20.4.", "Wzorzec Obserwator");
        Task task205 = new Task("20.5.", "Klasyfikator statystyczny książek");
        StudentsHomework johnsHomework = new StudentsHomework("John Watson");
        StudentsHomework irenesHomework = new StudentsHomework("Irene Adler");
        StudentsHomework henrysHomework = new StudentsHomework("Henry Stanley");
        Mentor arthur = new Mentor("Arthur", "Doyle");
        Mentor david = new Mentor("David", "Livingstone");
        johnsHomework.registerObserver(arthur);
        irenesHomework.registerObserver(arthur);
        henrysHomework.registerObserver(david);
        //When
        johnsHomework.addTask(task201);
        johnsHomework.addTask(task204);
        irenesHomework.addTask(task202);
        irenesHomework.addTask(task203);
        henrysHomework.addTask(task203);
        henrysHomework.addTask(task204);
        henrysHomework.addTask(task205);
        //Then
        assertEquals(4, arthur.getUpdateCount());
        assertEquals(3, david.getUpdateCount());
    }
}