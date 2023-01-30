package interfaces;

public class ChessGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("move piece straight");
    }

    @Override
    public void right() {
        System.out.println("move piece right");
    }

    @Override
    public void down() {
        System.out.println("move piece diagonally");
    }

    @Override
    public void left() {
        System.out.println("move piece left");
    }
}
