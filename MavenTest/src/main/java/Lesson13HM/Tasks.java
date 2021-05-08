package Lesson13HM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Tasks {

    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
    List<String> strings = Arrays.asList("bob","vov","tom","gov");
    List<String> strings1 = Arrays.asList("bob","vovvR","toOm","gvsov","tomy","Lvec","dcwd","dwcc");


    public int sum() {
        Integer sum = integers.stream()
                .collect(Collectors.summingInt(Integer::intValue))/integers.size();
        return sum;
    }

    public ArrayList<Pair> upperCase(){
        ArrayList<Pair> pair = new ArrayList<>();
        for(int i = 0;i<strings.size();i++){
            pair.add(new Pair(strings.get(i),strings.get(i).toUpperCase(Locale.ROOT)));
        }

        return pair;
    }
    public ArrayList<String> lowerCase4(){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<strings1.size();i++){
            if(strings1.get(i).length()==4&strings1.get(i)==strings1.get(i).toLowerCase()){
                list.add(strings1.get(i));
            }
        }
        return list;
    }


}
