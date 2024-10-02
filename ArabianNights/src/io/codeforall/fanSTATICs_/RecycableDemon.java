package io.codeforall.fanSTATICs_;

public class RecycableDemon extends Genie {
    public Genie genie;
    public MagicLamp lamp;

    public RecycableDemon() {
        super(Integer.MAX_VALUE);
    }

    @Override
    public void grantWish() {
        if (super.getGrantedWishes() < Integer.MAX_VALUE){
            super.grantWish();
            return;
        }
        System.out.println("Cant grant wish!");
    }
}
