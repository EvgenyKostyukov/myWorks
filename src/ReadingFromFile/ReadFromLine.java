package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromLine {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator +  "Users" + separator +
                      "maste" + separator + "Desktop" + separator + "test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
