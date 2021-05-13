package Lesson13HM;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Tasks {

    List<String> strings = Arrays.asList("bob","vov","tom","gov");
    List<String> strings1 = Arrays.asList("bob","vovvR","toOm","gvsov","tomy","Lvec","dcwd","dwcc");


    public OptionalDouble sum() {
        OptionalDouble res = IntStream.of(1,2,3,4,5,6,7,8,9,10).average();
        return res;
    }

    public ArrayList<Pair> upperCase(){
        ArrayList<Pair> pair = new ArrayList<>();
        for(int i = 0;i<strings.size();i++){
            pair.add(new Pair(strings.get(i),strings.get(i).toUpperCase()));
        }
        return pair;
    }
    public List<String> lowerCase4(){
       List<String> list = new ArrayList<>();
            list = strings1.stream()
                .filter(s -> s.length()==4&&s.equals(s.toLowerCase()))
                .collect(Collectors.toList());


        return list;
    }


}
