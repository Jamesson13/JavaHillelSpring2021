package Lesson8HW;
import java.util.Arrays;
import java.util.Scanner;

public class Names implements iNames{

    private String[] names = {"Коля", "Вася", "Петя", "Влад", "Женя"};

    public String[] getArray(){
        return names;
    }

    public boolean addName(int index, String value) {
        String[] namesNew = new String[names.length * 2];
        for (int i = 0; i < namesNew.length; i++) {
            if (i != index) {
                namesNew[i] = names[i];
            } else if (i == index) {
                namesNew[i] = value;
                System.arraycopy(names, index, namesNew, index + 1, names.length - index);
                break;
            }
        }
        for (int i = 0; i < namesNew.length; i++) {
            if (namesNew[i] == null)
                break;
            System.out.println(namesNew[i]);
        }
        return false;
    }

    public boolean addNameValue(String value) {
        String[] namesNew = new String[names.length * 2];
        namesNew = Arrays.copyOf(names, names.length + 2);
        for (int i = 0; i < namesNew.length; i++) {
            if (namesNew[i] == null) {
                namesNew[i] = value;
                break;
            }
        }
        for (int i = 0; i < namesNew.length; i++) {
            if (namesNew[i] == null)
                break;
            System.out.println(namesNew[i]);
        }
        return false;
    }


    public boolean deleteValue(String value) {
        String[] namesNew = new String[names.length * 2];
        for (int i = 0; i < namesNew.length; i++) {
            if (names[i] != value) {
                namesNew[i] = names[i];
            } else if (names[i] == value) {
                System.arraycopy(names, i + 1, namesNew, i, names.length - i - 1);
                break;
            }
        }
        for (int i = 0; i < namesNew.length; i++) {
            if (namesNew[i] == null)
                break;
            System.out.println(namesNew[i]);
        }
        return false;
    }

    public void getFromIndex(int index) {
        for (int i = 0; i < names.length; i++) {
            if (i == index) {
                System.out.println(names[i]);
            }
        }
    }

    public boolean containValue(String value) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(value)) {
                System.out.println("Contain!");
                System.out.println("Index : " + i + " value : " + names[i]);
            }
        }
        return false;

    }

    public boolean arrayEquals(String[] names2) {
        if (names.equals(names2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are no equals");
        }
        return false;
    }

    public boolean clearNames() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure yes=1/no=0");
        System.out.println("-----> ");
        int answer = scan.nextInt();
        if (answer != 1) {
            System.out.println("Sorry try next time");
        } else {
            System.out.println("Your Array clear");
            for (int i = 0; i < names.length; i++) {
                names[i] = null;
                System.out.println(names[i]);
            }
        }
        return false;
    }


    public void getSize(){
        System.out.println("Size of Array  :" + names.length);
    }

}
