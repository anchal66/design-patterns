package structural.bridge;

public class Circle implements Shape{
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "Draw in " + color.fill();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + color +
                '}';
    }
}
