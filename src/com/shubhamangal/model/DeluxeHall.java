package com.shubhamangal.model;

public class DeluxeHall extends HallBooking {

    private double decorationCharges;

    public DeluxeHall(String customerName, String phoneNumber, int numberOfDays, double costPerDay, double decorationCharges) {
        super(customerName, phoneNumber, numberOfDays, costPerDay);
        this.decorationCharges = decorationCharges;
    }

    @Override
    public double calculateCharges() {
        return (numberOfDays * costPerDay) + decorationCharges;
    }

    @Override
    public void displayBookingDetails() {
        System.out.println("--- Deluxe Hall Booking ---");
        System.out.println("Customer Name      : " + customerName);
        System.out.println("Phone Number       : " + phoneNumber);
        System.out.println("Number of Days     : " + numberOfDays);
        System.out.println("Cost Per Day       : " + costPerDay);
        System.out.println("Decoration Charges : " + decorationCharges);
        System.out.println("Total Charges      : " + calculateCharges());
    }
}