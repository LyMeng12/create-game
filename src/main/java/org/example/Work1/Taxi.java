package org.example.Work1;

public class Taxi extends Transport{
    double Fare;

    public Taxi(String name,double km,double Fare,double payment) {
        super(name, km, payment);
        this.Fare = Fare;
    }

    public void Price(double price) {
        this.payment=price;
    }
    public double getpayment() {
        return payment;
    }


    @Override
    public String Payment(){
        if(getpayment()==Fare){
            return "Already";
        } else {
            return "Not Payment";
        }
    }


    public void Display(){
        System.out.println("Name: "+name+"  Used: Taxi"+" Km: "+km+" Fare: "+Fare +"$"+ " Payment: "+payment +"$ "+ "Payment Already: "+Payment());
    }
}
