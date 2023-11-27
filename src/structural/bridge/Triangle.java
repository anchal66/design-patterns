package structural.bridge;

public class Triangle implements Shape{
    private Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "Triangle " + color.fill();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + color +
                '}';
    }
}
