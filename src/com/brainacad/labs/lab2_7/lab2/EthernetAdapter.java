package com.brainacad.labs.lab2_7.lab2;

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
