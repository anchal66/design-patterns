package structural.decorator;

public class NormalCoffeeMachine implements CoffeeMachine{
    @Override
    public void makeSmallCoffee() {
        System.out.println("Making Normal small coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Making Normal large coffee");
    }
}
