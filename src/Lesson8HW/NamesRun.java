package Lesson8HW;

public class NamesRun {
    public static void main(String[] args) {
        Names name = new Names();
        String[] names1 = {"Коля","Вася","Петя","Влад","Женя"};
        String[] names2 = name.getArray();

        //name.clearNames();
        //name.containValue("Влад");
        //name.arrayEquals(names2);
        //name.addName(2,"Bob");
        //name.addNameValue("Bob");
        //name.deleteValue("Петя");
        //name.getFromIndex(3);
        name.getSize();
    }
}
