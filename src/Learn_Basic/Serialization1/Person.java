package Learn_Basic.Serialization1;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 6758824788074355807L;
    private transient int id;
    private   String name;
    private int age;



    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}

