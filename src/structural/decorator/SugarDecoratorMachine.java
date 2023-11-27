package structural.decorator;

public class SugarDecoratorMachine extends CoffeeDecoratorMachine{
    public SugarDecoratorMachine(CoffeeMachine normalCoffeeMachine) {
        super(normalCoffeeMachine);
    }
    public void makeLargeCoffee() {
        System.out.println("With Sugar");
        normalCoffeeMachine.makeLargeCoffee();
    }
    public void makeMilkCoffee() {
        System.out.println("Making Advance milk coffee and sugar");
    }
}
