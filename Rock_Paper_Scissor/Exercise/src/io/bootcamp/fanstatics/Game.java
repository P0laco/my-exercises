package io.bootcamp.fanstatics;

public class Game {

    Player player1 = new Player();
    Player player2 = new Player();

    public void Winner_Loser() {
        switch (player1.hand()) {
            case ROCK:
                ConstList playerVsRock = player2.hand();
                if ( playerVsRock == ConstList.ROCK){
                    System.out.println(ConstList.ROCK + " vs " + playerVsRock + " = TIED!" );
                }
                if ( playerVsRock ==ConstList.PAPER) {
                    System.out.println(ConstList.ROCK + " vs " + playerVsRock + " = Player 2 WINS!");
                }
                if (playerVsRock == ConstList.SCISSOR) {
                    System.out.println(ConstList.ROCK + " vs " + playerVsRock + " = PLAYER 1 WINS");
                }
                break;
            case PAPER:
                ConstList playerVsPaper = player2.hand();
                if (playerVsPaper ==  ConstList.ROCK) {
                    System.out.println(ConstList.PAPER + " vs " + playerVsPaper + " = Player 1 WINS");
                }
                if (playerVsPaper == ConstList.PAPER) {
                    System.out.println(ConstList.PAPER + " vs " + playerVsPaper + " = TIED");
                }
                if (playerVsPaper == ConstList.SCISSOR) {
                    System.out.println(ConstList.PAPER + " vs " + playerVsPaper + " = PLAYER 2 WINS");
                }
                break;
            case SCISSOR:
                ConstList playerVsScissor = player2.hand();
                if (playerVsScissor == ConstList.ROCK){
                    System.out.println(ConstList.SCISSOR + " vs " + playerVsScissor + " = Player 2 WINS!");
                }
                if (playerVsScissor == ConstList.PAPER) {
                    System.out.println(ConstList.SCISSOR + " vs " + playerVsScissor + " = Player 1 WINS!");
                }
                if (playerVsScissor == ConstList.SCISSOR){
                    System.out.println(ConstList.SCISSOR + " vs " + playerVsScissor + " = TIED");
                }
                break;
        }
    }

}
