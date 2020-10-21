
/*
работаем с классами и методами
 */
package Learn_Internet;

public class IMain_1 {

    public static void main(String[] args) {

        IPerson_1 vitya = new IPerson_1(120, "Vitya");
        vitya.say("George");
        System.out.println(vitya.name + " s height is " + vitya.height);

        IPerson_1 vlad = new IPerson_1();
        System.out.println(vlad.height);

        IPerson_1 dima = new IPerson_1("Dima");
        System.out.print(dima.name);
    }
}
