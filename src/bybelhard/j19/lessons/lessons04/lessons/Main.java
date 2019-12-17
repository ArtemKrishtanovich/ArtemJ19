package bybelhard.j19.lessons.lessons04.lessons;

public class Main {

    public static void main(String[] args) {

        Country brazil = new Country();
        brazil.title = "Brazil";
        brazil.zipCode = 123456;

        Person alfredo = new Person();

        alfredo.name = "Alfredo";
        alfredo.age = 21;
        alfredo.country = brazil;
        alfredo.sex = Sex.MALE;

        Person tereza = new Person();

        tereza.name = "Tereza";
        tereza.age = 20;
        tereza.country = brazil;
        tereza.sex = Sex.FAMALE;

//        System.out.println(tereza.age);
//        System.out.println(alfredo.country.zipCode);

        alfredo.walk();
        alfredo.eat("fish");

        int newAge = alfredo.growOld();
        System.out.println(newAge);
        System.out.println(alfredo.growOld());

        System.out.println(alfredo);
        System.out.println(tereza);



    }

}