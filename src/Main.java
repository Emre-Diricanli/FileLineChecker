import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file1 name: ");
        String file1 = sc.next();
        System.out.print("Enter the file2 name: ");
        String file2 = sc.next();
        System.out.println("");

        int lineNumber = 1;

        try {

            Scanner sc1 = new Scanner(new File(file1));
            Scanner sc2 = new Scanner(new File(file2));

            String line1, line2;

            while (sc1.hasNextLine() && sc2.hasNextLine()) {
                line1 = sc1.nextLine();
                line2 = sc2.nextLine();

                if (!line1.equals(line2)) {
                    System.out.println("Line " + lineNumber);
                    System.out.println("< " + line1);
                    System.out.println("> " + line2);
                }
                lineNumber++;
            }

            if ((sc1.hasNextLine() && !sc2.hasNextLine()) || (!sc1.hasNextLine() && sc2.hasNextLine())) {
                System.out.println("Files have different number of lines");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}