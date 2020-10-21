package Learn_Internet;

public class ITest2 {

    public int weight = 0;
    public int height = 5;
    public String color = "black";
    public String model = "BMW";
    public String gender = "man";


    public void carRide(String route) {
        System.out.println("drive in route: " + route);
    }

    public void driverWhereGo(String whereGo) {
        System.out.println("Where will go? " + whereGo);
    }

    public ITest2() {
    }

    public ITest2(int w) {
        weight = w;


    }
}




