package Lesson25HW;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
@Setter
@Getter
@Accessors(chain = true)

public class Student {
    @Id
    @Column(name = "id_student")
    private int id_student;
    @Column(name = "fio")
    private String fio;
    @Column(name = "id_group")
    private int id_group;
    @Column(name = "admission_year")
    private String admission_year;

    public Student() {

    }

    public Student(int id_student, String fio, int id_group, String admission_year) {
        this.id_student = id_student;
        this.fio = fio;
        this.id_group = id_group;
        this.admission_year = admission_year;
    }

    @Override
    public String toString() {
        return  "FIO = " + fio +
                ", ID group = " + id_group +
                ", Admission year = " + admission_year;
    }
}
