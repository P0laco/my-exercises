package io.codeforall.fanSTATICs_;

public class Main {
    public static void main(String[] args) {
        MagicLamp lamp1 = new MagicLamp(1);
        //MagicLamp lamp2 = new MagicLamp(3);

        Genie genie1 = lamp1.invokeGenie();
        genie1.grantWish();
        genie1.grantWish();
        genie1.grantWish();
        System.out.println("==================");
        Genie genie2 = lamp1.invokeGenie();
        genie2.grantWish();
        genie2.grantWish();
        genie2.grantWish();
        genie2.grantWish();
        lamp1.recycle(genie2);
        genie2.grantWish();
        System.out.println("==================");
        /*Genie genie3 = lamp1.invokeGenie();
        genie3.grantWish();
        System.out.println("==================");*/
        Genie genie3 = lamp1.invokeGenie();
        genie3.grantWish();
        genie3.grantWish();

    }
}
