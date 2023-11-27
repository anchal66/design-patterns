package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueTriangle = new Triangle(new Blue());
        System.out.println(redCircle);
        System.out.println(blueTriangle);
    }
}
