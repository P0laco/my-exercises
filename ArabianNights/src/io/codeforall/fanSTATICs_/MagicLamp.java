package io.codeforall.fanSTATICs_;

public class MagicLamp {

    public int numberOfGenies;
    private int geniesRemain;
    public int geniesGenerated;
    public int  rechargeUses;

    public MagicLamp(int numberOfGenies) {
        if (numberOfGenies < 0) {
            System.out.println("Please insert a valid number of genies!");
        }
        this.numberOfGenies = numberOfGenies;
        this.geniesGenerated = 0;
        this.geniesRemain = numberOfGenies - geniesGenerated;
        this.rechargeUses = 0;
    }

    public Genie invokeGenie() {
        this.geniesGenerated++;
        if (numberOfGenies < 1) {
            System.out.println("You cant invoke until u change the amount of genies with lamp");
            return null;
        }
        if (geniesGenerated > numberOfGenies) {
            System.out.println("Demon Created");
            return new RecycableDemon();
        }
        if (geniesGenerated % 2 == 0) {
            System.out.println("Friendly genie created");
            return new FriendlyGenie(3);
        }
        System.out.println("Grumpy genie created");
        return new GrumpyGenie();
    }

    public void recycle(RecycableDemon demon) {
        this.geniesGenerated = 0;
        rechargeUses++;
        System.out.println("Recycled");
    }
    public void compare(MagicLamp lamp){
        if (this.numberOfGenies == lamp.numberOfGenies
                && this.geniesRemain == lamp.geniesRemain
                && this.rechargeUses == lamp.rechargeUses){
            System.out.println("The lamps are the same!");
            return;
        }
        System.out.println("Lamps are not the same!");
    }
}
