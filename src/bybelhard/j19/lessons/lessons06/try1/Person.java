package bybelhard.j19.lessons.lessons06.try1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void getName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void getAge(int age) {
        this.age = age;

    }

}
