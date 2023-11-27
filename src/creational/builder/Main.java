package creational.builder;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer.CustomerBuilder()
                .setName("Avinash")
                .setAddress("Pata nai")
                .build();
        System.out.println(customer);
    }
}
