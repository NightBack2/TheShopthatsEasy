package com.pluralsight;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean financeOption;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold,
                         double salesTaxAmount, double recordingFee, double processingFee, boolean financeOption) {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financeOption = financeOption;
    }

    // Implement abstract methods
    @Override
    public double getTotalPrice() {
        // Calculate total price based on sales contract details
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        // Calculate monthly payment based on sales contract details
        return 0;
    }

    // Getters and setters specific to SalesContract
}
