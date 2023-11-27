package creational.factoryMethod;

public class ShapeFactory {

    public static final String TRIANGLE = "Triangle";
    public static final String SQUARE = "Square";

    public static Shape getShape(String type){
        switch(type){
            case TRIANGLE:
                return new Triangle();
            case SQUARE:
                return new Square();
            default:
                throw new IllegalArgumentException("Object not found");
        }
    }
}
