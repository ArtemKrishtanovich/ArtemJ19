package bybelhard.j19.lessons.lessons03.homework03;

public class task6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) sum += nums[i];
        System.out.println("сумма = " + sum);
        System.out.println("cреднее арефметическое =" + sum/nums.length);
    }
}
