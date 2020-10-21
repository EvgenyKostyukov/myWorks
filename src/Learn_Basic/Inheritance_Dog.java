package Learn_Basic;

import java.sql.SQLOutput;

public class Inheritance_Dog extends Inheritance_Animal{

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("I am barking!");
    }

    public void showName(){
        System.out.println(name);
    }

}
