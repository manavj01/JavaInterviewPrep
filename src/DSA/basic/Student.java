package DSA.basic;

import java.sql.SQLOutput;

public class Student {
    // id, name, school name, address, feesPaid
    int id;
    String name;
    static String school = "AMPS";

    Student(int id, String name) {
        this.id = id;
        this.name = name;


    }

//    Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }


    Student() {

    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Nikku");
        Student s2 = new Student(2, "Manav");
        Student s3 = new Student(3, "Ishit");
        Student s4 = new Student(4, "Abhi");

        System.out.println(s1.id + s1.name + school);
    }

}
