package bybelhard.j19.lessons.lessons04.homework.Task3;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.printInfo();
        player.move(3,4);
        player.printInfo();
        player.move(-3,-4);
        player.printInfo();
    }

}
