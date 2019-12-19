package bybelhard.j19.lessons.lessons04.homework.Task2;

public class Main {
    public static void main(String[] args) {


        Player Wanted = new Player(0, 0);

        System.out.println("Текущие координаты Игрока Wanted: x = " + Wanted.getX() + ", у = " + Wanted.getY());
        System.out.println("Сдвинем Игрока по оси Х на 3 и по оси У на 4");

        Wanted.moveX(3);
        Wanted.moveY(4);

        System.out.println("Новые координаты Игрока Wanted: x = " + Wanted.getX() + ", у = " + Wanted.getY());
    }
}


