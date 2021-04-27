package Lesson12HW;

public class NamesRun {
    public static void main(String[] args) {
        Names name = new Names();
        String[] names1 = {"Коля","Вася","Петя","Влад","Женя"};
        String[] names2 = name.getArray();

        //System.out.println(name.clearNames().length);
        //name.containValue("Вла");
        //name.arrayEquals(names1);
        //name.addName(2,"Bob");
        //name.addNameValue("Bob");
        //name.deleteValue("Петя");
        //System.out.println(name.getFromIndex(3));
        System.out.println(name.getSize());
    }
}
