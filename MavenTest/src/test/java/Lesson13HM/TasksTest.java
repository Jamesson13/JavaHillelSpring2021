package Lesson13HM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

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
        OptionalDouble expected = task.sum();
        OptionalDouble actual = OptionalDouble.of(5.5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void upperCase() {
        Tasks task = new Tasks();
        List<Pair> expected = task.upperCase();
        List<Pair> actual = list;
        Assertions.assertEquals(expected.toString(),actual.toString());

    }

    @Test
    void lowerCase4() {
        Tasks task = new Tasks();
        List<String> expected = task.lowerCase4();
        List<String> actual = list2;
        Assertions.assertEquals(expected,actual);

    }

}