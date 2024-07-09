package couriers;

import couriers.interfaces.Sender;

public abstract class Courier implements Sender {

    private String name;

    public Courier(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
