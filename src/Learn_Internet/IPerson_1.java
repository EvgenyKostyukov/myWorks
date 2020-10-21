package Learn_Internet;

public class IPerson_1 {
    public int height = 180;
    public String name = "Default";

    public void say(String name) {
        System.out.println("Hello, " + name);
    }

    public IPerson_1() {
    }

    public IPerson_1(int h, String n) {
        height = h;
        name = n;
    }

    public IPerson_1(String n) {
        name = n;
    }
}
