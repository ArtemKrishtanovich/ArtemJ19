package bybelhard.j19.lessons.lessons04.homework.Task2;

public class Player {
    private double x, y;

    Player(double ax, double ay) {
        x = ax;
        y = ay;
    }

        double getX() {
        return x;
    }

        double getY() {
        return y;
    }

       void moveX(double dx) {
        x = x + dx;
    }

        void moveY(double dy) {
        y = y + dy;
    }
}
