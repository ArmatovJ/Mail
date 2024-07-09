package couriers.Curier;

import couriers.Courier;

public class FootCourier extends Courier {

    public FootCourier(String name) {
        super(name);
    }

    @Override
    public void sendPackage() {
        System.out.println("Доставка через: " + getName());
    }
}
