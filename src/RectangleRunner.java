public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println(rectangle);

        rectangle.setLength(45);
        rectangle.setWidth(100);
        System.out.println(rectangle);
    }

}
