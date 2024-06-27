package com.pluralsight;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold,
                         double expectedEndingValue, double leaseFee) {
        super(date, customerName, customerEmail, vehicleSold);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    // Implement abstract methods
    @Override
    public double getTotalPrice() {
        // Calculate total price based on lease contract details
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        // Calculate monthly payment based on lease contract details
        return 0;
    }

    // Getters and setters specific to LeaseContract
}
