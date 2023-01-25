public class BiNumber {
    private int x, y;

    public BiNumber(int a, int b) {
        this.x = a;
        this.y = b;
    }

    int add() {
        return this.x + this.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int multiply() {
        return this.x * this.y;
    }

    void doubleNumbers() {
        this.x *= 2;
        this.y *= 2;
        System.out.println(this.x);
        System.out.println(this.y);
    }

}
