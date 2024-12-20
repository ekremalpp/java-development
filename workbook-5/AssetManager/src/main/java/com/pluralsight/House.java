package com.pluralsight;

public class House extends Asset{
   private String address;
   private int condition;
   private int squareFoot;
   private int lostSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lostSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lostSize = lostSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLostSize() {
        return lostSize;
    }

    public void setLostSize(int lostSize) {
        this.lostSize = lostSize;
    }
    @Override
    public double getValue() {
        double value = 0;

        switch (condition) {
            case 1:
            value = 180.0 * squareFoot;
            break;
            case 2:
                value = 130.00 * squareFoot;
                break;
            case 3 :
                value = 90.00 * squareFoot;
                break;
            case 4:
                value = 80.00 * squareFoot;
                break;
        }
        value += 0.25 * lostSize;
        return  value;

    }
}
