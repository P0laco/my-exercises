package io.codeforall.fanSTATICs_;

public class Wallet {

    public int walletMoney;

    public Wallet(int walletMoney){
        if (walletMoney < 0){
            System.out.println("Your wallet cant have negative values! Either 0 or positive value!");
        }
        this.walletMoney = walletMoney;
    }


}
