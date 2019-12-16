package bybelhard.j19.lessons.lessons03.homework03;

public class task1 {
    public static void main(String[] args) {
        int a=17;
        String result;
        if (a<10) {
            result = "Jacket";
        } else if (a<15) {
            result = "windbreaker";
        } else if (a<20) {
            result = "Sweater";
        } else if (a<30) {
            result = "Shirt";
        } else {
            result = "Nothing";
        }
        System.out.println(result);
        System.out.println(a);
    }
}
