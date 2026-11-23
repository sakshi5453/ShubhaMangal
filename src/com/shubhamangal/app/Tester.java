package com.shubhamangal.app;

import java.util.Scanner;
import com.shubhamangal.model.BasicHall;
import com.shubhamangal.model.DeluxeHall;
import com.shubhamangal.model.HallBooking;
import com.shubhamangal.exception.InvalidHallBookingException;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Number of Days: ");
            int days = sc.nextInt();

            if (days <= 0) {
                throw new InvalidHallBookingException("Number of days must be greater than 0");
            }

            System.out.print("Enter Cost Per Day: ");
            double cost = sc.nextDouble();

            if (cost <= 0) {
                throw new InvalidHallBookingException("Cost per day must be greater than 0");
            }

            System.out.println("Choose Hall Type:");
            System.out.println("1. Basic Hall");
            System.out.println("2. Deluxe Hall");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            HallBooking booking = null;

            if (choice == 1) {
                booking = new BasicHall(name, phone, days, cost);
            } else if (choice == 2) {
                System.out.print("Enter Decoration Charges: ");
                double decoration = sc.nextDouble();
                if (decoration < 0) {
                    throw new InvalidHallBookingException("Decoration charges cannot be negative");
                }
                booking = new DeluxeHall(name, phone, days, cost, decoration);
            } else {
                throw new InvalidHallBookingException("Invalid Hall Type Choice");
            }

            booking.displayBookingDetails();

        } catch (InvalidHallBookingException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid Input");
        } finally {
            sc.close();
        }
    }
}