package Lesson10HW.Task2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collect {

    public boolean useIterator(Collection<String> coll){
        Iterator<String> i = coll.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
            if(i.hasNext()==false){
                break;
            }
        }
        return false;
    }

}
class CollRun{
    public static void main(String[] args) {
        Collect coll = new Collect();
        List<String> list = List.of("Мая","Даша","Катя","Меля","Nick");
        String[] names1 = {"Коля","Вася","Петя","Влад","Женя"};

        coll.useIterator(list);

    }
}














