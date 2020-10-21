package Learn_Basic.Enum;



public class Test {
    public static void main(String[] args) {

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
//        Season season = Season.AUTUMN;
//        Animal animal = Animal.CAT;
//        System.out.println(animal.name());

//        Animal frog = Animal.valueOf("FROG");
//        System.out.println(frog.getTranslation());


        //Animal animal = Animal.CAT;
        /*System.out.println(animal.getTranslation());
        System.out.println(animal);*/

        /**switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
        }*/
        /**Season season = Season.WINTER;
        System.out.println(season.getTemperature());*/

        /**switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }*/
    }
}
