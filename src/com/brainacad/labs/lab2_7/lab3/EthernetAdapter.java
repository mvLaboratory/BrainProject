package com.brainacad.labs.lab2_7.lab3;

import com.brainacad.labs.lab2_7.lab1.Device;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, String serialNumber, float price, int speed, String mac) {
        super(manufacturer, serialNumber, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (getSpeed() != that.getSpeed()) return false;
        return getMac() != null ? getMac().equals(that.getMac()) : that.getMac() == null;

    }

    @Override
    public int hashCode() {
        int result = getSpeed();
        result = 31 * result + (getMac() != null ? getMac().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", serialNumber='" + super.getSerialNumber() + '\'' +
                ", price=" + super.getPrice() +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
}
