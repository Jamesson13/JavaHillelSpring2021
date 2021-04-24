package Lesson6HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PeopleMethods implements iPeopleMethods {
    private ArrayList<People> userList = new ArrayList<>();

    public void addUser(People user){
        userList.add(user);
    }



    //сведения об абонентах, которые пользовались междугородной связью;
    public  void  getUserListWithInternational(long timeInternational){
        System.out.println("Люди которые пользовались междугородной связью ---> ");
        for (People user : userList){
            if (user.getTimeInternational() > timeInternational) {
                System.out.println(user.toString());
            }
        }
    }

    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    public void getUserWhoExceedTime (long localTime){
        System.out.println("Люди, у который время внутригородских разговоров превышает ---> " + localTime);
        for(People user : userList){
            if(user.getTimeLocal()>localTime){
                System.out.println(user.toString());
            }
        }
    }
    // сведения об абонентах в алфавитном порядке.
    public ArrayList<People> getUserByAlphabet(){
        ArrayList<People> listOfUser = new ArrayList<>(userList);
        Collections.sort(listOfUser, new Comparator<People>() {
            @Override
            public int compare(People user1, People user2) {
                return user1.getName().compareToIgnoreCase(user2.getName());
            }
        });
        return listOfUser;
    }


    //сведения об первых 10 абонентов у который самый большой трафик интернета
    public ArrayList<People> getInternetUsers(){
        ArrayList<People> listOfUser = new ArrayList<>(userList);
        Collections.sort(listOfUser, new Comparator<People>() {
            @Override
            public int compare(People user1, People user2) {
                return user1.getInternetTrafic()==user2.getInternetTrafic()? 0 : user1.getInternetTrafic()>user2.getInternetTrafic()?-1:1;
            }
        });
        return listOfUser;
    }

}
