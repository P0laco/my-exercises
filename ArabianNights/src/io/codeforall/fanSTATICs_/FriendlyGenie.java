package io.codeforall.fanSTATICs_;

public class FriendlyGenie extends Genie{

    public FriendlyGenie(int wishes) {
        super(wishes);
    }

    @Override
    public void grantWish(){
        if (super.getGrantedWishes() != super.getMaxWishes()){
            super.grantWish();
            return;
        }
            System.out.println("You used the entire amount of wishes!");
        }
}
