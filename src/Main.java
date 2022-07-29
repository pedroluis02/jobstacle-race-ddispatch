import shared.Game;
import visitorpattern.VpGame;

public class Main {
    public static void main(String[] args) {
        Game game = new VpGame();
        game.start();
    }
}