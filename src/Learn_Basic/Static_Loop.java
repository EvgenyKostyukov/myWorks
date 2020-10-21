package Learn_Basic;

public class Static_Loop {
    public static void main(String[] args) {

        Humanss h1 = new Humanss("Bob", 40);
        Humanss h2 = new Humanss("Tom", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Humanss h3 = new Humanss("Rob", 50);
        h3.printNumberOfPeople();

        /*
        Humanss.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Humanss.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
         */

    }
}

class Humanss {

    private String name;
    private int age;
    private static int countPeople;
    //public static String description;


    public Humanss(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }

    /*public void getAllFields(){
        System.out.println(name + "," + age + "," + description);
    }*/

}