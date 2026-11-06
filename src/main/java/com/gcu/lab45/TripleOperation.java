package com.gcu.lab45;

public class TripleOperation implements NumberOperation {
    @Override
    public int apply(int a, int b) {
        return a * 3 + b * 3; // Example operation: triple both numbers and add them
    }
    
}
