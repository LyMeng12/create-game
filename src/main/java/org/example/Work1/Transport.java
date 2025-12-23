package org.example.Work1;

abstract class Transport {
    String name;
    double km;
    double payment;


    public Transport(String name, double km , double payment) {
        this.name = name;
        this.km = km;
        this.payment = payment;
    }
    abstract String Payment();


}
