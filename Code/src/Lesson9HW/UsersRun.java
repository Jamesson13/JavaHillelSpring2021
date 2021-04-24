package Lesson9HW;

import java.util.List;

public class UsersRun {
    public static void main(String[] args) {
        Users user = new Users();
        String[] arr = {"Коля","Толя","Жора"};
        List<String> list = List.of("Мая","Даша","Катя","Меля","Nick");
        List<String> list2 = List.of("Вася","Петя","Ваня","Влад","Игорь");

        user.addBack("Вася");
        user.addBack("Петя");
        user.addBack("Ваня");
        user.addBack("Влад");
        user.addBack("Игорь");
        user.addFront(null);
        user.addFront(null);
        user.addFront(null);
        user.addBack(null);
        user.addBack("Call");
        user.addBack(null);
        user.addBack("Боря");

        //user.addFront("Bob");

        //user.deleteValue("Влад");
        //user.addArray(arr);
        //user.getValue(3);
        //System.out.println(user.getSize());
        //System.out.println(user.getSize());
        //user.clear();
        //user.addColl(list);
        //user.deleteIndex(4);
        user.trim();
        user.printList();
        //System.out.println(user.contains("Влад"));

        //System.out.println(user.compare(list2));


    }
}
