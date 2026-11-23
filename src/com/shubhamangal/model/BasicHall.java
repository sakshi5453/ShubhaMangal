package com.shubhamangal.model;

public class BasicHall extends HallBooking {

    public BasicHall(String customerName, String phoneNumber, int numberOfDays, double costPerDay) {
        super(customerName, phoneNumber, numberOfDays, costPerDay);
    }

    @Override
    public double calculateCharges() {
        return numberOfDays * costPerDay;
    }

    @Override
    public void displayBookingDetails() {
        System.out.println("--- Basic Hall Booking ---");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + phoneNumber);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Cost Per Day  : " + costPerDay);
        System.out.println("Total Charges : " + calculateCharges());
    }
}