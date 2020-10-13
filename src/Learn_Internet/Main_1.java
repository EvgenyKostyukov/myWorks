
/*
работаем с классами и методами
 */
package Learn_Internet;

public class Main_1 {

    public static void main(String[] args) {

        Person_1 vitya = new Person_1(120, "Vitya");
        vitya.say("George");
        System.out.println(vitya.name + " s height is " + vitya.height);

        Person_1 vlad = new Person_1();
        System.out.println(vlad.height);

        Person_1 dima = new Person_1("Dima");
        System.out.print(dima.name);
    }
}
