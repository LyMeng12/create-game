package org.example.Work1;

abstract class Transport {
    String name;
    double km;
//    int money;


    public Transport(String name, double km) {
        this.name = name;
        this.km = km;
//        this.money = money;
    }

    abstract  double CaculateFare();


}
