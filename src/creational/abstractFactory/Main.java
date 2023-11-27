package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(new DBFactory());
        c1.communicate();
        Client c2 = new Client(new NetworkFactory());
        c2.communicate();
    }
}
