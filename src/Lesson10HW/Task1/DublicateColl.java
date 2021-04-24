package Lesson10HW.Task1;

import java.util.*;

public class DublicateColl {
    private ArrayList<String> list = new ArrayList<>();

    public boolean add(String value){
        list.add(value);
        return false;
    }
    public Collection<String> retColl(){
        return list;
    }
    public Collection deleteDuplicate(Collection<String> coll){
        Set<String> set = new HashSet<>(list);
        return set;
    }





}

class DuplicateRun{
    public static void main(String[] args) {
        DublicateColl dup = new DublicateColl();

        dup.add("Петя");
        dup.add("Вася");
        dup.add("Коля");
        dup.add("Петя");
        dup.add("Коля");
        dup.add("Тоня");
        dup.add("Жора");
        dup.add("1");
        dup.add("1");

        System.out.println(dup.deleteDuplicate(dup.retColl()));

    }
}
