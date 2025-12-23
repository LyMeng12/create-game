package org.example.Work1;

public class Bus extends Transport{
    double  distance = 0.5;
    double money = 1;
    double Fare;

    public Bus(String name,double km,double payment) {
        super(name,km,payment);
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
        System.out.println("Name: "+name+"  Used: Bus"+" Km: "+km+" Fare: "+CaculateFare() + " Payment: "+payment + "Payment Already: "+Payment());
    }

}
