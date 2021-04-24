package Lesson6HW;
import java.util.ArrayList;

public interface iPeopleMethods {

    void  getUserListWithInternational(long timeInternational);

    void getUserWhoExceedTime (long localTime);

    ArrayList<People> getUserByAlphabet();

    ArrayList<People> getInternetUsers();

    void addUser(People user);
}
