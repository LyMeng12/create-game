package org.example;

public class Student {
    int ID;
    String Name;
    String Gender;
    int Age;
    String PhoneNumber;
    public Student(int ID, String Name, String Gender, int Age, String PhoneNumber) {
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
        System.out.println("Student ID: " + getID() + " Name: " + getName() + " Gender: " + getGender() + " Age: " + getAge() + " PhoneNumber: " + getPhoneNumber() );
    }
}
