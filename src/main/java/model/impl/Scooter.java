package model.impl;

import model.Vehicle;

public class Scooter implements Vehicle {

    private final double money;

    public Scooter(double money) {
        this.money = money;
        paymentDeposit();
    }

    public void paymentDeposit() {
        System.out.println("Your deposit is " + money + "$ now");
    }

    @Override
    public void unlock() {
        System.out.println("Scooter was successful unlocked. Enjoy your ride!");
    }
}
