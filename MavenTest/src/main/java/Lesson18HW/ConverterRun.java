package Lesson18HW;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class ConverterRun {
    public static void main(String[] args) throws IOException, ParseException {
        ConvectorJsonYaml conv = new ConvectorJsonYaml();
        Scanner scanner = new Scanner(System.in);
        String path;

        System.out.println("Enter path to directory");
        path = scanner.next();

        conv.convertFiles(path);
    }
}
