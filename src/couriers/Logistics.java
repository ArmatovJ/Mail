package couriers;

import couriers.Curier.CarCourier;
import couriers.Curier.BikeCourier;
import couriers.Curier.FootCourier;
import couriers.interfaces.Sender;

import java.util.HashMap;
import java.util.Map;

public class Logistics {

    private Sender courier;

    public void sendPackage(int distance){

        if(distance < 1000){
            courier = new FootCourier("FootCourier");
        }else if (distance < 5000){
            courier = new BikeCourier("BikeCourier");
        }else {
            courier = new CarCourier("CarCourier");
        }

        courier.sendPackage();

    }
}
