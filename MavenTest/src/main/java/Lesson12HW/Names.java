package Lesson12HW;
import java.util.Arrays;

public class Names implements iNames{

    private String[] names = {"Коля", "Вася", "Петя", "Влад", "Женя"};

    public String[] getArray(){
        return names;
    }

    public String[] addName(int index, String value) {
        String[] namesNew = new String[names.length +1];
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
        return namesNew;
    }

    public String[] addNameValue(String value) {
        String[] namesNew;
        namesNew = Arrays.copyOf(names, names.length +1);
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
        return namesNew;
    }


    public String[] deleteValue(String value) {
        String[] namesNew = new String[names.length-1];
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
        return namesNew;
    }

    public String getFromIndex(int index) {
        String value = "";
        for (int i = 0; i < names.length; i++) {
            if (i == index) {
                value = names[i];
            }
        }
        return value;
    }

    public String containValue(String value) {
        String cont = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(value)) {
                System.out.println("Contain!");
                System.out.println("Index : " + i + " value : " + names[i]);
                cont = names[i];
            }
        }
        return cont;
    }

    public boolean arrayEquals(String[] names2) {
        if (names.equals(names2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are no equals");
        }
        return false;
    }

    public String[] clearNames() {
        String[] namesNew = new String[0];
            names=namesNew;
        return names;
    }


    public int getSize(){
       int size = names.length;
       return size;
    }

}
