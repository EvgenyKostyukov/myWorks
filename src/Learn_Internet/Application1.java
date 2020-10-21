package Learn_Internet;

public class Application1 {
    public static void main(String[] args) {

        Cat1 cat10 = new Cat1("Barsik");
        Cat1 cat11 = new Cat1("Bug", 3);

        System.out.println(cat10.nickname + cat11.nickname + cat11.age);

    }
}