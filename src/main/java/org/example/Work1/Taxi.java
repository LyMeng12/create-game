package org.example.Work1;

public class Taxi extends Transport{
    double  distance = 1;
    double money = 3;
    double Fare;

    public Taxi(String name,double km) {
        super(name,km);
    }

    @Override
    public double CaculateFare(){
        return Fare = money+(km*distance);
    }
}
