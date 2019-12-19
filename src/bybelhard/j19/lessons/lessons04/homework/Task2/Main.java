package bybelhard.j19.lessons.lessons04.homework.Task2;

public class Main {
    public static void main(String[] args) {


        Player Wanted = new Player(1, 2);

        System.out.println("Текущие координаты Игрока Wanted: x = " + Wanted.getX() + ", у = " + Wanted.getY());
        System.out.println("Сдвинем Игрока по оси Х на 5 и по оси У на -1");

        Wanted.moveX(5);
        Wanted.moveY(-1);

        System.out.println("Новые координаты Игрока Wanted: x = " + Wanted.getX() + ", у = " + Wanted.getY());
    }
}


