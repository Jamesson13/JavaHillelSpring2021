package Lesson25HW;

import java.sql.SQLException;
import java.util.Scanner;

public class DataBaseRun {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        DataBaseHib dbo = new DataBaseHib();
        int option = 0;
        boolean exit = false;

        System.out.println("Database operations.");

        while(!exit){
            System.out.println("Choose option:" +
                    "\n1 - Insert record." +
                    "\n2 - Get student by ID" +
                    "\n3 - Get students by Name" +
                    "\n4 - Quit");

            while(true) {
                try {
                    option = Integer.parseInt(scanner.next());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Enter a number");
                    continue;
                }
            }

            System.out.println();

            switch (option){
                case 1:
                    dbo.addRecord(); break;
                case 2:
                    System.out.print("Enter id: "); dbo.getStudent(scanner.nextInt()); break;
                case 3:
                    System.out.print("Enter name: "); dbo.getStudent(scanner.next()); break;
                case 4:
                    exit = true;
            }
        }
    }
}
