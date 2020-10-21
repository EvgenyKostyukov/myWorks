package Learn_Basic;

public class Inheritance_Animal_2 {
    public static void main(String[] args) {
        Inheritance_Animal animal = new Inheritance_Animal();
        animal.eat();
        animal.sleep();

        Inheritance_Dog dog = new Inheritance_Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.eat();
        dog.showName();

    }
}
