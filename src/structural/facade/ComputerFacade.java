package structural.facade;

import java.util.Arrays;

public class ComputerFacade {
    private Cpu processor;
    private Memory ram;
    private HardDrive ssd;

    public ComputerFacade() {
        this.processor = new Cpu();
        this.ram = new Memory();
        this.ssd = new HardDrive();
    }
    public void start(){
        processor.freeze();
        ram.load(1, ssd.read(2L, 2));
        processor.jump(1);
        processor.execute();
    }
}
