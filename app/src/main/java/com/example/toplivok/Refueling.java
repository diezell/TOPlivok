package com.example.toplivok;

import java.util.Date;

public class Refueling {
    private Long odometer;
    private Float price;
    private Float cost;
    private long refuelingData;

    public Refueling() {}
    public Refueling(Long odometer, Float price, Float cost) {
        this.odometer = odometer;
        this.price = price;
        this.cost = cost;
        this.refuelingData = -1 * new Date().getTime();
    }

    public Long getOdometer() {
        return odometer;
    }

    public void setOdometer(Long odometer) {
        this.odometer = odometer;
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
