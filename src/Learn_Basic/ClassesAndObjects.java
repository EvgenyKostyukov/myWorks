package Learn_Basic;

public class ClassesAndObjects {
    public static void main(String[] args) {
       Person person1 = new Person();
       person1.setName("");
       person1.setAge(3);
       System.out.println("Выводим значение в main методе: " + person1.getName());
       System.out.println("Выводим значение в main методе: " + person1.getAge());

    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Error");
        } else {
        name = userName;}
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<0){
            System.out.println("Error 1");
        } else {
        age = userAge;}
    }

    public int getAge(){
        return age;
    }


    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i<3; i++)
        System.out.println("My name is: " + name + ", I am " + age + " years old!" );
    }

    void sayHello(){
        System.out.println("Hello!");
    }
}