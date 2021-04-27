package Lesson12HW;
public interface iNames {


    public String[] addName(int index, String value);
    public String[] addNameValue(String value);
    public String[] deleteValue(String value);
    public String getFromIndex(int index);
    public String containValue(String value);
    public boolean arrayEquals(String[] names2);
    public String[] clearNames();
    public int getSize();
}
