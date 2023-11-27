package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Avinash", "Gurguan");
        System.out.println(customer);
        System.out.println(customer.getName() + " " + customer.getAddress());
        Customer clone = customer.clone();
        System.out.println(clone);
        System.out.println(customer.getName() + " " + customer.getAddress());
    }

}
