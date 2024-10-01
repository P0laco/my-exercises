package io.codeforall.fanSTATICs_;

public class Sandbox {
    public static void main(String[] args) {
        Bank myNewBank = new Bank(100);
        Wallet myNewWallet = new Wallet(0);
        Person myPerson = new Person("Miguel", myNewBank , myNewWallet);

        myPerson.retrieveMoney(50);
        System.out.println("===============================");
        myPerson.depositMoney(10);
        System.out.println("===============================");
        myPerson.moneyToUse(10);
        System.out.println("===============================");
        myPerson.personBalance();
    }
}
