package com.kodilla.steps.salary;

class PieceWorkSalaryEmployee implements Employee {

    private double pieces;
    private double piecePay;

    public PieceWorkSalaryEmployee(double pieces, double piecePay) {
        this.pieces = pieces;
        this.piecePay = piecePay;
    }

    public double calculateSalary() {
        return this.pieces * this.piecePay;
    }
}
