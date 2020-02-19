package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r,String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "Codegym";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(111,"Hoang");
        Student student2 = new Student(222,"Khanh");
        Student student3 = new Student(333,"Nam");
        student1.display();
        student2.display();
        student3.display();
    }
}
