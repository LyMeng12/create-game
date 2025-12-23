package org.example.Work1;

public class Taxi extends Transport{
    double  distance = 1;
    double money = 3;
    double Fare;

    public Taxi(String name,double km,double payment) {
        super(name, km, payment);
    }

    @Override
    public double CaculateFare(){
        return Fare = money+(km*distance);
    }

    @Override
    public String Payment(){
        if(payment==CaculateFare()){
            return "Already";
        } else {
            return "Not Payment";
        }
    }


    public void Display(){
        System.out.println("Name: "+name+"  Used: Taxi"+" Km: "+km+" Fare: "+CaculateFare() + " Payment: "+payment + "Payment Already: "+Payment());
    }
}
