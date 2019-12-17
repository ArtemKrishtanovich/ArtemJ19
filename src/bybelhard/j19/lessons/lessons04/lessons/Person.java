package bybelhard.j19.lessons.lessons04.lessons;

public class Person {

    String name;
    int age;
    Country country;
    Sex sex;

    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;                    //this это ссылка на какой то конкретный объект
        this.age = age;
        this.country = country;
        this.sex = sex;
    }


    void walk() {
  //      System.out.println(name + "is walking");
        walk(10);
    }

    void walk (int minutes) {
        System.out.println(name + " is walking for " + minutes + " minutes");
    }

    void eat (String dish) {
        System.out.println(name + " is eating " + dish + ". Om-nom-nom!");
    }
    int growOld(){
        return ++age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", sex=" + sex +
                '}';
    }
}
