package org.example;

import javax.security.auth.Subject;
import java.util.ArrayList;

public class Student extends Major {
    int ID;
    String Name;
    String Gender;
    int Age;
    String PhoneNumber;


    public Student(int MajorID,String MajorName , int ID, String Name, String Gender, int Age, String PhoneNumber) {
        super(MajorID,MajorName);
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getGender() {
        return Gender;
    }
    public int getAge() {
        return Age;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void diplayStudent(){
        System.out.println("Student ID: " + getID() + " Name: " + getName() + " Gender: " + getGender() + " Age: " + getAge() + " PhoneNumber: " + getPhoneNumber() + " Major: " + getMajorName());
    }
}
