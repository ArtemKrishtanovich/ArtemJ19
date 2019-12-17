package bybelhard.j19.lessons.lessons03.homework03;

public class task2 {
    public static void main(String[] args) {

        int salary1 = 100;
        int salary2 = 300;
        int salary3 = 200;

        int min, max;

        min = salary1;
        if (salary2<min)
            min=salary2;
        if (salary3<min)
            min=salary3;

        max = salary1;
        if (salary2>max)
            max=salary2;
        if (salary3>max)
            max=salary3;

        System.out.println("Different max and min is :" + (max-min));


    }
}
