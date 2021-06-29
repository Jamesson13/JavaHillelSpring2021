package Lesson23HW;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataBaseRun {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        DataBaseFiches dbf = new DataBaseFiches();
        int option = 0;
        boolean exit = false;

        System.out.println("Database operations.");

        while(!exit){
            System.out.println("Choose option:" +
                    "\n1 - Delete record by id." +
                    "\n2 - Insert record." +
                    "\n3 - Get all students" +
                    "\n4 - Get student by ID" +
                    "\n5 - Get students by Name" +
                    "\n6 - Quit");

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
                    System.out.print("Enter id: "); dbf.deleteRecord(scanner.nextInt()); break;
                case 2: dbf.addRecord(); break;
                case 3: dbf.selectAllRecords(); break;
                case 4:
                    System.out.print("Enter id: "); dbf.getStudent(scanner.nextInt()); break;
                case 5:
                    System.out.print("Enter name: "); dbf.getStudent(scanner.next()); break;
                case 6: exit = true;
            }
        }
    }

}
