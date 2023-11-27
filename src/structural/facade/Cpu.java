package structural.facade;

public class Cpu {
    void freeze() {
        System.out.println("Freezing...");
    }

    void jump(long position) {
        System.out.println("Jumping " + position);
    }

    void execute() {
        System.out.println("Executing...");
    }
}
