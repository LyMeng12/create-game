package org.example;

public class Student extends Course{
    int id;
    String name;
    int age;
    String gender;
    int phone;


    public Student(String Coursename,int CourseID,int Courseqty , int id, String name, int age, String gender, int phone) {
        super(CourseID,Coursename,Courseqty);
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }
    public void display() {
        System.out.println("Name: " + name + " Age: " + age + " Gender: " + gender + " Phone: " + phone + " course: " + Coursename);
    }
}
