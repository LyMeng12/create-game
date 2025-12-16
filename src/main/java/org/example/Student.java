package org.example;

public class Student extends Course{
    int id;
    String name;
    int age;
    String gender;
    int phone;


    public Student(String Coursename,int CourseID , int id, String name, int age, String gender, int phone) {
        super(CourseID,Coursename);
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public int getPhone() {
        return phone;
    }
    public String getCoursename() {
        return Coursename;
    }

    public void display() {
        System.out.println(" ID: "+getId()+" Name: " + getName() + " Age: " + getId() + " Gender: " + getGender() + " Phone: " + getAge() + " course: " + getCoursename());
    }
}
