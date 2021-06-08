package Lesson18HW;

import java.io.IOException;
import java.text.ParseException;

public interface iConverter {
    public void convertToJSON(String jsonFile) throws IOException, ParseException, org.json.simple.parser.ParseException;
    public void convertToYAML(String yamlFile) throws IOException;
}
