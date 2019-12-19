package bybelhard.j19.lessons.lessons04.homework.Task1;

import bybelhard.j19.lessons.lessons04.homework.Task1.Address;
import bybelhard.j19.lessons.lessons04.homework.Task1.Building;

public class Main {
    public static void main(String[] args) {

        Address street = new Address();
        street.street = "TimeSquare";
        street.number = 12;

Building building = new Building();

building.type = "Hotel";
building.address = street;
building.floors = 13;
building.age = 2;
building.elevator = "Yes";
building.material = "Made of wood";

        System.out.println(building.material);
        System.out.println(building.address);

    }

}
