package com.kodilla.steps.transaction;

class ATM extends Bank {

    public void insertCard() {
        System.out.println("Please insert your card.");
    }

    public void enterPin() {
        System.out.println("Please enter PIN.");
    }

    public void enterAmount() {
        System.out.println("Please enter the amount you want to withdraw.");
    }

    @Override
    protected void receivePaymentRequest() {
        System.out.println("Request received.");
    }

    @Override
    protected void checkAccount() {
        System.out.println("Checking the account balance. Please wait...");
    }

    @Override
    protected void acceptPaymentRequest() {
        System.out.println("Your request has been accepted");
    }

    public void payCash() {
        System.out.println("Paying...");
    }

    public void thankForUsingAtm() {
        System.out.println("Transaction finished. Thank you for using our ATM.");
    }

    public void run() {
        this.insertCard();
        this.enterPin();
        this.enterAmount();
        this.receivePaymentRequest();
        this.checkAccount();
        this.acceptPaymentRequest();
        this.payCash();
        this.thankForUsingAtm();
    }
}
