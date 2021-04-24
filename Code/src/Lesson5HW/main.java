package Lesson5HW;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student stud1 = new Student("Иван", "Иванович", "Иванов", "05.11.2004", "380671234567", "Кибернетика", "1", "123");
        Student stud2 = new Student("Петр", "Петрович", "Петров", "11.05.2003", "380672345678", "Оргтехника", "2", "321");
        Student stud3 = new Student("Семен", "Семенович", "Семенов", "23.03.2001", "380673456789", "Программирования", "3", "231");
        Student stud4 = new Student("Николай", "Николаевич", "Николаев", "01.06.2003", "380674567890", "Кибернетика", "1", "123");
        Student stud5 = new Student("Сергей", "Сергеевич", "Сергеев", "22.12.2002", "3804676789010", "Оргтехника", "2", "321");
        Student stud6 = new Student("Василий", "Васильевич", "Васильев", "24.10.2000", "380677689011", "Программирования", "3", "231");
        Student stud7 = new Student("Анатолий", "Анатольевич", "Анатольев", "16.01.2004", "380677688904", "Кибернетика", "1", "123");
        Student stud8 = new Student("Антон", "Антонович", "Антонов", "14.09.2003", "380677687900", "Программирования", "2", "321");
        Student stud9 = new Student("Роман", "Романович", "Романов", "19.07.2001", "380673423678", "Программирования", "3", "231");
        Student stud10 = new Student("Федор", "Федорович", "Федоров", "07.12.2003", "380671235477", "Кибернетика", "1", "123");
        Student stud11 = new Student("Виктор", "Викторович", "Викторов", "21.03.2003", "380679988777", "Оргтехника", "2", "321");
        Student stud12 = new Student("Богдан", "Богданович", "Богданов", "09.02.2001", "380671133543", "Программирования", "3", "231");
        Student stud13 = new Student("Геннадий", "Генадьевич", "Генадьев", "27.03.2003", "380679809123", "Кибернетика", "1", "123");
        Student stud14 = new Student("Семен", "Семенович", "Семенов", "22.04.2001", "380672233764", "Оргтехника", "2", "321");


        StudentTasks newList = new StudentTasks();
        newList.addStudent(stud1);
        newList.addStudent(stud2);
        newList.addStudent(stud3);
        newList.addStudent(stud4);
        newList.addStudent(stud5);
        newList.addStudent(stud6);
        newList.addStudent(stud7);
        newList.addStudent(stud8);
        newList.addStudent(stud9);
        newList.addStudent(stud10);
        newList.addStudent(stud11);
        newList.addStudent(stud12);
        newList.addStudent(stud13);
        newList.addStudent(stud14);
        //a) список студентов заданного факультета; - Факульет
        newList.showStudentFromFaculty("Программирования");
        //b) списки студентов для каждого факультета и курса; - Факультет, Группа
        newList.showStudentFromFacultyAndCourse("Кибернетика","1");
        //c) список студентов, родившихся после заданного года; - Год рождения
        newList.studentOlderOfYear(2002);
        //d) список учебной группы. - Группа
        newList.showStudentFromGroup("123");



    }
}
