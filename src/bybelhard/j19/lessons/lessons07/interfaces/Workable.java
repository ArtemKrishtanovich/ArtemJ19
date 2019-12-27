package bybelhard.j19.lessons.lessons07.interfaces;

public interface Workable {

    String VERSION = "ONE";

    void work();

    static void statMethod() {
        System.out.println("Workable.staticMethod()");
    }

    default void  defMethod() {
        System.out.println("Workable.deafultMethod()");
    }

    private void privateMethod () {
        System.out.println("Workable.privateMethod");
    }
}
