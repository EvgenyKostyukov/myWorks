package Learn_Internet;

public class Person_1 {
    public int height = 180;
    public String name = "Default";

    public void say(String name) {
        System.out.println("Hello, " + name);
    }

    public Person_1() {
    }

    public Person_1(int h, String n) {
        height = h;
        name = n;
    }

    public Person_1(String n) {
        name = n;
    }
}
