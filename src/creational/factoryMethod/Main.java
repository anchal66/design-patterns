package creational.factoryMethod;

public class Main {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeFactory.TRIANGLE);
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.SQUARE);
        shape.getShape();
        shape2.getShape();
    }

}
