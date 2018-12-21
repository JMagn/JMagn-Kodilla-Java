package com.kodilla.steps.map;

class Student {

    String name;
    String lastName;
    String pesel;

    public Student (String name, String lastName, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public int hashCode(){
        return Integer.parseInt(pesel.substring(0, 2));
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Student) {
            Student otherObj = (Student) obj;
            return (this.name == otherObj.name) && (this.lastName == otherObj.lastName) && (this.pesel == otherObj.pesel);
        }
        return false;
    }

    public String toString() {
        return name + " " + lastName;
    }
}
