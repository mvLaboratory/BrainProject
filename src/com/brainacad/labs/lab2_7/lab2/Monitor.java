package com.brainacad.labs.lab2_7.lab2;

import com.brainacad.labs.lab2_7.lab1.Device;

public class Monitor extends Device {
    private int resolutionX, resolutionY;

    public Monitor(String manufacturer, String serialNumber, float price, int resolutionX, int resolutionY) {
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", serialNumber='" + super.getSerialNumber() + '\'' +
                ", price=" + super.getPrice() +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
}
