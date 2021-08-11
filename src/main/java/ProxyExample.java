import model.Vehicle;
import proxy.ProxyVehicle;

public class ProxyExample {
    public static void main(String[] args) {

        Vehicle scooter = new ProxyVehicle(50);
        scooter.unlock();

    }
}
