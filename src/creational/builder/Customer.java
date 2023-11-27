package creational.builder;

public class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static class CustomerBuilder {
        private String name;
        private String address;

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(name, address);
        }
    }
}
