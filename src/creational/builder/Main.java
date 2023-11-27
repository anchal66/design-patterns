package creational.builder;

public class Main {
    Customer customer = new Customer.CustomerBuilder()
            .setName("John Doe")
            .setAddress("123 Main St")
            .build();
}
