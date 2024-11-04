package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double totalValue = 0;
        for (Valuable asset : assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            return null; //
        }

        Valuable mostValuable = assets.get(0);
        double maxValue = mostValuable.getValue();

        for (Valuable asset : assets) {
            double value = asset.getValue();
            if (value > maxValue) {
                maxValue = value;
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null; //
        }

        Valuable leastValuable = assets.get(0);
        double minValue = leastValuable.getValue();

        for (Valuable asset : assets) {
            double value = asset.getValue();
            if (value < minValue) {
                minValue = value;
                leastValuable = asset;
            }
        }
        return leastValuable;
    }
}