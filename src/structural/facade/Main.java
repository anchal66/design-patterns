package structural.facade;

public class Main {
    public static void main(String[] args) {
        //Hiding all business logic in ComputerFacade
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}
