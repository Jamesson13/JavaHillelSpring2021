package Lesson13HM;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TasksTest {

    List<String> list2 = Arrays.asList("tomy","dcwd","dwcc");

        ArrayList<Pair> list = new ArrayList<>(Arrays.asList(
                new Pair("bob","BOB"),
                new Pair("vov","VOV"),
                new Pair("tom","TOM"),
                new Pair("gov","GOV")));



    @Test
    void sum() {
        Tasks task = new Tasks();
        int expected = task.sum();
        int actual = 3;
        Assert.assertEquals(expected,actual);
    }

    @Test
    void upperCase() {
        Tasks task = new Tasks();
        List<Pair> expected = task.upperCase();
        List<Pair> actual = list;
        Assert.assertEquals(expected.toString(),actual.toString());

    }

    @Test
    void lowerCase4() {
        Tasks task = new Tasks();
        List<String> expected = task.lowerCase4();
        List<String> actual = list2;
        Assert.assertEquals(expected,actual);

    }

}