package structural.decorator;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffee = new NormalCoffeeMachine();
        coffee = new CoffeeDecoratorMachine(coffee);
        coffee = new SugarDecoratorMachine(coffee);
        coffee.makeSmallCoffee();
        coffee.makeLargeCoffee();
        coffee.makeSmallCoffee();
    }
}
