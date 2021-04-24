package Lesson7HW;
import java.util.ArrayList;


public class PeopleMethods {

    private ArrayList<String> peopleList = new ArrayList<>();

    public void addUser(String user){
        peopleList.add(user);
    }

    public boolean addPeople(int index,String value){
        peopleList.add(index,value);
        return false;
    }
    public boolean addPeopleValue(String value){
        peopleList.add(value);
        return false;
    }
    public boolean deleteIndex(int index){
        peopleList.remove(index);
        return false;
    }
    public boolean deleteValue(String value){
        peopleList.remove(value);
        return false;
    }
    public void getIndex(int index){
        System.out.println(peopleList.get(index));
    }

    public void print(){
        for(int i = 0;i<peopleList.size();i++) {
            System.out.println(peopleList.get(i));
        }
    }

}
