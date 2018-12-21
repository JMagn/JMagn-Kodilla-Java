package com.kodilla.steps.salary;

class BasisAndBonusSalaryEmployee implements Employee {

    private double basis;
    private boolean bonus;

    public BasisAndBonusSalaryEmployee(double basis, boolean bonus) {
        this.basis = basis;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return bonus == true ? 1.2 * this.basis : this.basis;
    }
}
