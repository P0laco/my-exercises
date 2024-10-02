package io.codeforall.fanSTATICs_;

public class Genie {
    private int maxWishes;
    private int grantedWishes;

    public Genie(int maxWishes) {
        this.grantedWishes = 0;
        this.maxWishes = maxWishes;
    }

    public void setGrantedWishes(){
        grantedWishes = Integer.MAX_VALUE;
    }
    public int getGrantedWishes() {
        return grantedWishes;
    }

    public int getMaxWishes() {
        return maxWishes;
    }

    public void grantWish() {
        grantedWishes++;
        System.out.println("Wish Granted!");
    }
}
