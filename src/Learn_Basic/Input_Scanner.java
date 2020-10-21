package Learn_Basic;

import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = s.nextInt();
        System.out.println("You enter:  " + x);
    }
}
