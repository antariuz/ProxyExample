package proxy;

import model.Vehicle;
import model.impl.Scooter;

public class ProxyVehicle implements Vehicle {
    private final double money;
    private Scooter scooter;

    public ProxyVehicle(double money) {
        this.money = money;
    }

    @Override
    public void unlock() {
        if (scooter == null) {
            scooter = new Scooter(money);
        }
        scooter.unlock();
    }
}
