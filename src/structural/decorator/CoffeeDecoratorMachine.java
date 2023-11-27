package structural.decorator;

public class CoffeeDecoratorMachine implements CoffeeMachine {
    protected CoffeeMachine normalCoffeeMachine;

    public CoffeeDecoratorMachine(CoffeeMachine normalCoffeeMachine) {
        this.normalCoffeeMachine = normalCoffeeMachine;
    }

    //Decorators for overriding functionality
    @Override
    public void makeSmallCoffee() {
        System.out.println("Making Advance small coffee");
    }

    //Decorator for not overriding
    @Override
    public void makeLargeCoffee() {
        normalCoffeeMachine.makeLargeCoffee();
    }

    //Extended Behavior
    public void makeMilkCoffee() {
        System.out.println("Making Advance milk coffee");
    }
}
