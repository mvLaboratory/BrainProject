package com.brainacad.labs.lab2_7.lab3;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;

        Monitor monitor = (Monitor) o;

        if (getResolutionX() != monitor.getResolutionX()) return false;
        return getResolutionY() == monitor.getResolutionY();

    }

    @Override
    public int hashCode() {
        int result = getResolutionX();
        result = 31 * result + getResolutionY();
        return result;
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
