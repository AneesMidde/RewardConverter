package com.anees.rewardvalue;

public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0;
	private double cashValue; // Cash value in dollars
    private double milesValue; // Miles value
    
    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Conversion rate: 0.0035 dollars per mile
    }
    
    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Conversion rate: 0.0035 dollars per mile
    }
    
    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }
    
    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }
    
    // Example usage in a main method
    public static void main(String[] args) {
        // Example 1: Creating RewardValue with cash value
        double cashValue = 50.0; // $50 cash value
        RewardValue reward1 = new RewardValue(cashValue);
        System.out.printf("$%.2f cash value is equivalent to %.2f miles.%n", cashValue, reward1.getMilesValue());
        
        // Example 2: Creating RewardValue with miles value
        int milesValue = 10000; // 10000 miles
        RewardValue reward2 = new RewardValue(milesValue);
        System.out.printf("%.2f miles is equivalent to $%.2f cash value.%n", reward2.getMilesValue(), reward2.getCashValue());
    }
}
