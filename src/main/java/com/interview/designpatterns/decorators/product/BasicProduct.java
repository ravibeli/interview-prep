package com.interview.designpatterns.decorators.product;

// Concrete component
class BasicProduct implements Product {
    @Override
    public void process() {
        System.out.println("--> Processing basic product.");
    }
}
