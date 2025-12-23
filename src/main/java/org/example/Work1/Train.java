package org.example.Work1;

public class Train extends Transport{
    double  distance = 0;
    double money = 2;
    double Fare;

    public Train(String name , double km,double payment) {
        super(name,km,payment);
    }

    @Override
    public double CaculateFare(){
        return Fare=money+(km*distance);
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
        System.out.println("Name: "+name+"  Used: Train"+" Fare: "+CaculateFare() + " Payment: "+payment + "Payment Already: "+Payment());
    }
}
