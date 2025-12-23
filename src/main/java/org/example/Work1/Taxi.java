package org.example.Work1;

public class Taxi extends Transport{
    double Fare;

    public Taxi(String name,double km,double payment,double Fare) {
        super(name, km, payment);
        this.Fare = Fare;
    }


    @Override
    public String Payment(){
        if(payment==Fare){
            return "Already";
        } else {
            return "Not Payment";
        }
    }


    public void Display(){
        System.out.println("Name: "+name+"  Used: Taxi"+" Km: "+km+" Fare: "+Fare +"$"+ " Payment: "+payment + "Payment Already: "+Payment());
    }
}
