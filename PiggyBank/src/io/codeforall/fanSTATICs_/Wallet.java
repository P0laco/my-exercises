package io.codeforall.fanSTATICs_;

public class Wallet {
    public int walletMoney;
    public Wallet(int walletMoney){
        if (walletMoney < 0){
            System.out.println("Your wallet cant have negative values! Either 0 or positive value!");
        }
        this.walletMoney = walletMoney;
    }
    public void useWallet(int moneyToUse){
        if (moneyToUse > walletMoney){
            System.out.println("You dont have that amount of money in your wallet!");
            return;
        }
        if (moneyToUse <= walletMoney) {
            System.out.println("You just used " + moneyToUse + "€");
            walletMoney = walletMoney - moneyToUse;
            System.out.println("Your new Wallet balance is " + walletMoney + "€");
        }
    }


}
