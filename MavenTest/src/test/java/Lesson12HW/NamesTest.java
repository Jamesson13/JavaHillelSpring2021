package Lesson12HW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NamesTest {
    Names name = new Names();
    String[] names1 = {"Коля","Вася","Петя","Влад","Bob"};
    String[] names2 = name.getArray();

    @Test
    void getArray() {
        String [] expected = name.getArray();
        String [] actual = {"Коля", "Вася", "Петя", "Влад", "Женя"};
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void addName() {
        String[] expected = name.addName(3,"Bob");
        String[] actual = {"Коля", "Вася", "Петя","Bob", "Влад", "Женя"};
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void addNameValue() {
        String[] expected =name.addNameValue("Bob");
        String[] actual = {"Коля", "Вася", "Петя", "Влад", "Женя","Bob"};
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void deleteValue() {
        String[] expected =name.deleteValue("Петя");
        String[] actual = {"Коля", "Вася", "Влад", "Женя"};
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getFromIndex() {
        String expected = name.getFromIndex(3);
        String actual = "Влад";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void containValue() {
        String expected = name.containValue("Влад");
        String actual = "Влад";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void arrayEquals() {
        String[] expected = name.getArray();
        String[] actual = names2;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void clearNames() {
        String[] expected = name.clearNames();
        String[] actual = {};
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getSize() {
        int expected = name.getSize();
        int actual = 5;
        Assertions.assertEquals(expected, actual);
    }
}