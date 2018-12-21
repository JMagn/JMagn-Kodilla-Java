package com.kodilla.steps.salary;

public class Application {

    public static void main(String args[]) {

        PieceWorkSalaryEmployee employee = new PieceWorkSalaryEmployee(400, 5);
        BasisAndBonusSalaryEmployee employee1 = new BasisAndBonusSalaryEmployee(2000, true);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();

        processor = new SalaryPayoutProcessor(employee1);
        processor.processPayout();
    }
}
