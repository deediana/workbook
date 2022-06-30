package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {

    private int studentId;
    private String name;
    private LocalDate dateOfAdmission;


    public Student(){
        this.studentId = 110001;
        this.name = "Dave";
        this.dateOfAdmission = LocalDate.of(1951,11,18 );
    }

    public Student (int studentId, String name){
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = LocalDate.of(1990,12,07);

    }

    public Student(int studentId, String name, LocalDate dateOfAdmission){
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
