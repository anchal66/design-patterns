package structural.composite;

public class Main {
    public static void main(String[] args) {
        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("Processor", 100);
        Equipment hdd = new Equipment("HDD", 50);
        Composite memory = new Composite("Memory");
        Equipment ram = new Equipment("RAM", 15);
        Equipment rom = new Equipment("ROM", 20);

        memory.add(rom).add(ram);
        computer.add(processor).add(hdd).add(memory);
        System.out.println(computer.getPrice());
    }
}
