package io.codeforall.fanSTATICs_;

public class GrumpyGenie extends Genie {

    public GrumpyGenie() {
        super(1);
    }

    @Override
    public void grantWish() {
        if (super.getGrantedWishes() < 1){
            super.grantWish();
            return;
        }
            System.out.println("You cant use any more wishes!");
    }
}
