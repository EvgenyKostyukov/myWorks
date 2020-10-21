package Learn_Basic;

public class Object_ToString {
    public static void main(String[] args) {
        Human1 human5 = new Human1(30, "Bob");
        System.out.println(human5);

    }
}

class Human1{
    private int age;
    private String name;

    public Human1 (int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name + "," + age;
    }
}
