package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.util.Arrays;


public class MyStudentRecordsMgmtApp {
    public static void main(String[] args){

        MyStudentRecordsMgmtApp studentData = new MyStudentRecordsMgmtApp();

        Student[] students = new Student[5];
        students[0] = new Student();
        students[1] = new Student(110002,"Anna");
        students[2] = new Student(110003,"Erica", LocalDate.of(1974,1,31));
        students[3] = new Student(110004, "Carlos", LocalDate.of(2009,8,22));
        students[4] = new Student(110005, "Bob", LocalDate.of(1990,3,05));


        System.out.println("=======ListOfStudents=====");
        studentData.printListOfStudents(students);

        System.out.println("=======PlatinumAlumni=====");
        studentData.getListOfPlatinumAlumniStudents(students);

    }

    public void printListOfStudents(Student[] students){

        for(Student s : students){
            System.out.println(Arrays.asList(s));
        }

    }

   public void getListOfPlatinumAlumniStudents(Student[] students){

        for(Student s : students){
            if(s.getDateOfAdmission().getYear() <= 1992 ){
                System.out.println(Arrays.asList(s.getStudentId() + " " + s.getName() + " " + s.getDateOfAdmission()));
            }

        }


   }

}
