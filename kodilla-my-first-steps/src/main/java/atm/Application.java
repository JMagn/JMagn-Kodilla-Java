package atm;

public class Application {

    public static void main(String args[]) {

        ATM atm = new ATMImpl();

        atm.withdraw();
        atm.pay();
        atm.connetctWithBank();
        System.out.println(ATM.completeAction());
    }
}
