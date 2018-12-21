package com.kodilla.steps.average;

class Application {

    private static final String printSalary = "Salary [%d] = %d";

    private static final String printAverage = "Average salary = %f";

    public static final double calculateAverage(int sum, int salaryTableLength) {
        return ((double)sum) / salaryTableLength;
    }

    public static void main (String[] args) {

        int sum = 0;

        int [] salary = new int [] {
                2500, 3800, 4200, 1700, 8100, 22000, 567, 2500, 2567, 9087,
                1700, 8100, 12500, 9876, 4444, 1212, 2495, 5432, 1199, 2700
        };

        for (int i = 0; i < salary.length; i++) {
            System.out.println(String.format(printSalary, i, salary[i]));
            sum += salary[i];
        }

        System.out.println(String.format(printAverage, calculateAverage(sum, salary.length)));
    }
}
