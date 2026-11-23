package com.shubhamangal.model;

import com.shubhamangal.contract.HallCharges;

public abstract class HallBooking implements HallCharges {
    protected String customerName;
    protected String phoneNumber;
    protected int numberOfDays;
    protected double costPerDay;

    public HallBooking(String customerName, String phoneNumber, int numberOfDays, double costPerDay) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.numberOfDays = numberOfDays;
        this.costPerDay = costPerDay;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public abstract void displayBookingDetails();
}