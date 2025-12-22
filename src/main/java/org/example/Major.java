package org.example;

import java.util.HashSet;

public class Major {
    int MajorID;
    String MajorName;


    public Major(int MajorID, String MajorName ) {
        this.MajorID = MajorID;
        this.MajorName = MajorName;
//        this.students.add(s);

    }

    public  int getMajorID() {
        return MajorID;
    }
    public String getMajorName() {
        return MajorName;
    }
    public void setMajorName(String MajorName) {
        this.MajorName = MajorName;
    }

    public void DisplayNew() {
        System.out.println("Major ID: " + getMajorID()+ " Major Name: " + getMajorName());
    }
    public void Display() {
        System.out.print("Major ID: " + getMajorID()+ " Major Name: " + getMajorName());
    }
}
