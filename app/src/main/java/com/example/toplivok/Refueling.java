package com.example.toplivok;

import java.util.Date;

public class Refueling {
    private Long odometr;
    private Float price;
    private Float cost;
    private long refuelingData;

    public Refueling() {}
    public Refueling(Long odometr, Float price, Float cost) {
        this.odometr = odometr;
        this.price = price;
        this.cost = cost;
        this.refuelingData = new Date().getTime();
    }

    public Long getOdometr() {
        return odometr;
    }

    public void setOdometr(Long odometr) {
        this.odometr = odometr;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public long getRefuelingData() {
        return refuelingData;
    }

    public void setRefuelingData(long refuelingData) {
        this.refuelingData = refuelingData;
    }
}
