package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super("Jewelry", 0);
        this.karat = karat;
    }
    @Override
    public double getValue() {
        // Add your specific calculation for Jewelry value here
        double baseValue = 0; // Set the base value for Jewelry
        double karatValue = karat * 1000; // Assuming each karat is worth $1000
        return baseValue + karatValue;
    }
}
