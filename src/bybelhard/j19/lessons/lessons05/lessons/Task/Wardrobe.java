package bybelhard.j19.lessons.lessons05.lessons.Task;

public class Wardrobe {

    private Clothes [] shelves;

    public Wardrobe(int shelvesNumber) {
        if (shelvesNumber <1)
            return;


        this.shelves = new Clothes[shelvesNumber];
    }

    public void putOnShelf (Clothes clothes, int shelf) {

        if (shelf < 0 || shelf >= shelves.length) {
            System.out.println("BAD INPUT");
        }
        if (shelves[shelf] == null)
            shelves[shelf] = clothes;
        else
            System.out.println("BUSY");

    }
    public void trowInto (Clothes clothes) {

        for (int i = 0; 1 < shelves.length; i++) {
            if (shelves[1] == null) {
                shelves[1] = clothes;
                return;
            }
        }
        System.out.println("NO FREE SHELF");


    }
    public Clothes getFromShelf (int shelf) {
        if (shelf < 0 || shelf >= shelves.length) {
            System.out.println("BAD INPUT");
            } else if (shelves[shelf == null]) {
            System.out.println("EMPTY SHELF");
        }

        if (shelves[shelf] == null) {
            System.out.println("ENPTY SHELF");
            return null
        }
    }


    public void lookIntoWardrobe () {

        System.out.println();
    }
}
