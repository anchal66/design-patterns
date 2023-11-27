package structural.facade;

public class Memory {
    void load(long position, byte[] data) {
        System.out.println("Loading to pos " + position + " Data = " + data);
    }
}
