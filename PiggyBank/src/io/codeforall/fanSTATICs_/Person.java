package io.codeforall.fanSTATICs_;

public class Person {
    private String name;
    private Bank personBank;
    private Wallet personWallet;
    public Person(String name, Bank personBank, Wallet personWallet){
        this.name = name;
        this.personBank = personBank;
        this.personWallet = personWallet;
    }
    public void depositMoney(int moneyToDeposit){
        if (moneyToDeposit <= 0 ){
            System.out.println("Please deposit a positive amount!");
        }
        if (moneyToDeposit > 0 && moneyToDeposit <= personWallet.walletMoney ){
            personBank.saveMoney(moneyToDeposit);
            personWallet.walletMoney = personWallet.walletMoney - moneyToDeposit;
            System.out.println("Your wallet now has " + personWallet.walletMoney + "€");
        } else if (moneyToDeposit > 0 && moneyToDeposit > personWallet.walletMoney && personWallet.walletMoney >= 0) {
            System.out.println("You dont have that amount in your wallet!");
        }
    }
    public void retrieveMoney(int moneyToRetrieve){
        if (moneyToRetrieve < 0){
            System.out.println("Please insert a positive amount to retrieve!");
        }
        if (moneyToRetrieve > 0 && personBank.money >= moneyToRetrieve){
            personBank.takeMoney(moneyToRetrieve);
            personWallet.walletMoney = personWallet.walletMoney + moneyToRetrieve;
            System.out.println("Your wallet now has " + personWallet.walletMoney + "€");
            System.out.println("Your bank now has "+ personBank.money + "€");
        }
        if (moneyToRetrieve == 0){
            System.out.println("You have to insert a value to retrieve! Task not allowed");
        }

    }



}
