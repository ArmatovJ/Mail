package couriers.Curier;

import couriers.Courier;

public class BikeCourier extends Courier {

    public BikeCourier(String name) {
        super(name);
    }

    @Override
    public void sendPackage() {
        System.out.println("Доставка через: " + getName());
    }
}
