package com.kodilla.steps.transaction;

abstract class Bank {

    abstract protected void receivePaymentRequest();

    abstract protected void checkAccount();

    abstract protected void acceptPaymentRequest();
}
