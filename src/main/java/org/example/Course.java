package org.example;

public class Course {
    int CourseID;
    String Coursename;

    public Course(int CourseID, String Coursename) {
        this.CourseID = CourseID;
        this.Coursename = Coursename;

    }
    public int getCourseID() {
        return CourseID;
    }
    public String getCoursename() {
        return Coursename;
    }

    public void diplay(){
        System.out.println("ID: "+getCourseID()+" "+"Name: "+getCoursename()+" |");
    }
}
