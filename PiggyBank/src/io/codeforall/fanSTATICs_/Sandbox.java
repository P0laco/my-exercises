package io.codeforall.fanSTATICs_;

public class Sandbox {
    public static void main(String[] args) {
        Bank myNewBank = new Bank(-100);
        Wallet myNewWallet = new Wallet(-50);
        Person myPerson = new Person("Miguel", myNewBank , myNewWallet);
        
        myPerson.retrieveMoney(900);
        myPerson.depositMoney(900);




    }


}
