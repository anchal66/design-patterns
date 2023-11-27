package structural.composite;

import java.util.ArrayList;
import java.util.List;

//Use for keeping the tree structure and manipulate many object as single one
public class Composite extends Equipment{
    private List<Equipment> equipments = new ArrayList<>();

    public Composite(String name) {
        super(name, 0);
    }
    public Composite add(Equipment equipment){
        equipments.add(equipment);
        return this;
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Equipment equipment : equipments)
            sum+=equipment.getPrice();
        return sum;
    }
}
