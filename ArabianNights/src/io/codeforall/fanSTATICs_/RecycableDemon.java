package io.codeforall.fanSTATICs_;

public class RecycableDemon extends Genie{
    private MagicLamp isRecycled;
    private Genie genie;

    public RecycableDemon() {
        super(Integer.MAX_VALUE);
    }

    @Override
    public void grantWish(){
        if (!MagicLamp.recycle(genie)){
            super.grantWish();
            return;
        }
        System.out.println("Cant make wish");

    }
}
