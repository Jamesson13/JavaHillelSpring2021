package Lesson5HW;
import java.util.ArrayList;
import java.util.List;

public class StudentTasks {

    private List<Student> studentTask =new ArrayList<>();

    public void addStudent(Student s){
        studentTask.add(s);
    }

    public void showStudentFromFaculty(String faculty){
        System.out.println("Список студентов Факультета --->" + faculty);
        for(Student st : studentTask) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public void showStudentFromFacultyAndCourse(String faculty,String course){
        System.out.println("Список студентов Факультета --->" + faculty +"  курса --->"+ course);
        for (Student st :studentTask){
            if(st.getFaculty().equals(faculty)&st.getCourse().equals(course)){
                System.out.println(st.toString());
            }
        }
    }
    public int parseYears(String years){
        return Integer.parseInt(years);
    }
    public void studentOlderOfYear(int year) {
        System.out.println("Список студентов, родившихся после--> " + year + " года");
        for (Student st : studentTask) {
            String yearNumber= st.getDateOfBirth().substring(6);
            if (Integer.parseInt(yearNumber) > year) {
                System.out.println(st.toString());
            }

        }
    }
    public void showStudentFromGroup(String group) {
        System.out.println("Список студентов группы --->" + group);
        for (Student st : studentTask) {
            if (st.getGroup().equals(group)) {
                System.out.println(st.toString());
            }
        }
    }

}
