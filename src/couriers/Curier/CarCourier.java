package couriers.Curier;

import couriers.Courier;

public class CarCourier extends Courier {

    public CarCourier(String name) {
        super(name);
    }

    @Override
    public void sendPackage() {
        System.out.println("Доставка через: " + getName());
    }
}
