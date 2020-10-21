package Learn_Internet;

public class ITest3 {
    public static void main(String[] args) {

        ITest4 person1 = new ITest4 (34, 45, "woman");

        ITest4 person2 = new ITest4 ( 55);

        System.out.println(person1.weight +" "+ person1.height + person1.gender
                           +person2.gender + person2.weight );



    }
}
