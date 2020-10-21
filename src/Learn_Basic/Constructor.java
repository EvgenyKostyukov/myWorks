package Learn_Basic;

public class Constructor {
    public static void main(String[] args) {
        Humans humans1 = new Humans();
    }
}

class Humans {

    private String name;
    private int age;

    public Humans(){
        this.name = "Default";
        this.age = 0;
    }

    public Humans(String name){
        System.out.println("Привет из второго конструктора!");
        this.name= name;
    }

    public Humans(String name, int age) {
        System.out.println("Привет изтретьего конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
