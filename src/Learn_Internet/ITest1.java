
/* this program about
 * cars
 */
package Learn_Internet;

public class ITest1 {
    public static void main(String[] args) {

        ITest2 car1 = new ITest2();
        System.out.print("Avtomobile car1 model: " + car1.model + ", " +
                         "weight " + car1.weight + ", " + "color "
                         + car1.color + " ");
        car1.carRide("ahead!");

        ITest2 car2 = new ITest2();
        car2.model = "VW";
        car2.weight = 50;
        System.out.print("Avtomobile car2 model: " + car2.model + ", " +
                "weight " + car2.weight + ", " + "color "
                + car2.color + " ");
        car2.carRide("go back!");
        System.out.println();

        ITest2 driver1 = new ITest2 ();
        System.out.print("Driver1 - " + driver1.gender + ","
                         +  "height: " + driver1.height  + ". " + " ");
        driver1.driverWhereGo("go back");
        System.out.println();

        ITest2 driver2 = new ITest2();
        driver2.gender = "woman";
        driver2.height = 150;
        System.out.print("Driver2 - " + driver2.gender + ","
                +  "height: " + driver2.height  + ". " + " ");
        driver1.driverWhereGo("ahead");
        System.out.println();


    }
}

        /*
        car1.ride("ahead");


        System.out.println();

        ITest2 car2 = new ITest2 ();
        car2.ride("go back");
        car2.color = "white";
        car2.model = "VW";
        System.out.println(car2.weight + " "+ car2.model + " " + car2.color);



    }
}

         */