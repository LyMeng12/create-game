package org.example.Work1;

public class Bus extends Transport{
    double Fare;

    public Bus(String name,double km,double Fare,double payment) {
        super(name,km,payment);
        this.Fare = Fare;
    }
    public void Priec(double price){
        this.payment=price;
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
        System.out.println("Name: "+name+"  Used: Bus"+" Km: "+km+" Fare: "+Fare+"$"+ " Payment: "+payment + "Payment Already: "+Payment());
    }

}
