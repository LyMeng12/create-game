package org.example;

public class Major {
    int MajorID;
    String MajorName;
    public Major(int MajorID, String MajorName) {
        this.MajorID = MajorID;
        this.MajorName = MajorName;
    }
    public  int getMajorID() {
        return MajorID;
    }
    public String getMajorName() {
        return MajorName;
    }
    public void Display() {
        System.out.println("Major ID: " + getMajorID()+ " Major Name: " + getMajorName());
    }
}
