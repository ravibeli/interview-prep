package com.interview.decorators.car;

public class Demo {

    public static void main(String[] args) {
        System.out.println("\n------------------------------------------------------------------------------------");

        Car basic = new BasicCar();
        basic.assemble();
        System.out.println("\n------------------------------------------------------------------------------------");

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n------------------------------------------------------------------------------------");

        Car luxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxuryCar.assemble();
        System.out.println("\n------------------------------------------------------------------------------------");
    }

}




