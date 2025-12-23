package org.example.Work1;

public class Train extends Transport{
    double Fare;

    public Train(String name , double km,double payment,double Fare) {
        super(name,km,payment);
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
        System.out.println("Name: "+name+"  Used: Train"+" Fare: "+Fare +"$"+ " Payment: "+payment + "Payment Already: "+Payment());
    }
}
