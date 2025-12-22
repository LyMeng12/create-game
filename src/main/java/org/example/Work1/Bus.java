package org.example.Work1;

public class Bus extends Transport{
    double  distance = 0.5;
    double money = 1;
    double Fare;

    public Bus(String name,double km) {
        super(name,km);
    }
    @Override
    public double CaculateFare(){
         return Fare = money+(km*distance);
    }
}
