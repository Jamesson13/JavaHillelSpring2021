package Lesson8HW;
public interface iNames {


    public boolean addName(int index, String value);
    public boolean addNameValue(String value);
    public boolean deleteValue(String value);
    public void getFromIndex(int index);
    public boolean containValue(String value);
    public boolean arrayEquals(String[] names2);
    public boolean clearNames();
    public void getSize();
}
