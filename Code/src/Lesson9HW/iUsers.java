package Lesson9HW;
import java.util.Collection;

public interface iUsers {

    public void printList();
    public boolean addBack(String value);
    public boolean addFront(String value);
    public boolean addArray(String[] value);
    public boolean addColl(Collection<String> coll);
    public void deleteValue(String value);
    public void deleteIndex(int index);
    public String getValue(int index);
    public boolean contains(String value);
    public boolean clear();
    public int getSize();
    public boolean trim();
    public boolean compare(Collection<String> coll);

}
