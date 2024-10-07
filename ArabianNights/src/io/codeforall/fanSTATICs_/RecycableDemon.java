package io.codeforall.fanSTATICs_;

public class RecycableDemon extends Genie {
    public Genie genie;
    public MagicLamp lamp;
    private boolean  isRecycled;
    public RecycableDemon() {
        super(Integer.MAX_VALUE);
        this.isRecycled = false;
    }

    public void  setRecycled() {
        this.isRecycled = true;
    }

    public boolean Recycled(){
        return this.isRecycled;
    }

    @Override
    public void grantWish() {
        if (this.isRecycled){
            super.grantWish();
            return;
        }
        System.out.println("Cant grant wish!");
    }
}
