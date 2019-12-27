package bybelhard.j19.lessons.lessons07.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> list = List.of("one", "two", "three", "four", "five");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String curString = iterator.next();
            System.out.println(curString);
            if (curString.equals("four"));
            System.out.println("Четыре!");

        }
    }
}
