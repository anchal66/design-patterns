package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("/avinash/test.jpg");
        image.display();
        image.display();
    }
}
