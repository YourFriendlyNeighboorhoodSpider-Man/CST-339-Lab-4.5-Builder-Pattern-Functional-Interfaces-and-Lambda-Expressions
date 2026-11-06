package com.gcu.lab45;

public  class DoubleOperation implements NumberOperation {
    @Override
    public int apply(int a, int b) {
        return a * 2 + b * 2; // Example operation: double both numbers and add them
    }
    
}
