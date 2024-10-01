package io.codeforall.fanSTATICs_;

public class Bank {

    public int money;

    public Bank(int money){
        if (money < 0 ){
            System.out.println("Your account needs to start with money");
        }
        this.money = money;

    }
    public void takeMoney(int moneyToTake) {
        if (moneyToTake > money) {

        } else if (moneyToTake <= money) {
            System.out.println("You just took " + moneyToTake + "€ from your account");
            money = money - moneyToTake;
        }
    }
    public void saveMoney(int moneyToSave){
        money = money + moneyToSave;
        System.out.println("You deposited " + moneyToSave + "€");
        System.out.println("Your bank now has " + money + "€");

    }

}
