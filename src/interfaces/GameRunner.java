package interfaces;

public class GameRunner {

    public static void main(String[] args) {
        GamingConsole[] game = {new MarioGame(), new ChessGame()};

        for (GamingConsole g : game) {
            g.down();
            g.left();
            g.right();
            g.up();
        }
    }

}
