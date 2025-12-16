package org.example;

public class Major {
    int MajorID;
    String MajorName;
    int qty;
    public Major(int MajorID, String MajorName , int qty) {
        this.MajorID = MajorID;
        this.MajorName = MajorName;
        this.qty = qty;
    }
    public  int getMajorID() {
        return MajorID;
    }
    public String getMajorName() {
        return MajorName;
    }
    public int getQty() {
        return qty;
    }
    public void Display() {
        System.out.println("Major ID: " + getMajorID()+ " Major Name: " + getMajorName() + " Qty: " + getQty());
    }
}
