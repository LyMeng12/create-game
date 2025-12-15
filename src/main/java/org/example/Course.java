package org.example;

public class Course {
    int CourseID;
    String Coursename;
    int Courseqty;

    public Course(int CourseID, String Coursename, int Courseqty) {
        this.CourseID = CourseID;
        this.Coursename = Coursename;
        this.Courseqty = Courseqty;
    }
    public int getCourseID() {
        return CourseID;
    }
    public String getCoursename() {
        return Coursename;
    }
    public int getCourseqty() {
        return Courseqty;
    }
    public void diplay(){
        System.out.println("ID: "+getCourseID()+" "+"Name: "+getCoursename()+" "+"Quantity: "+getCourseqty()+" |");
    }
}
