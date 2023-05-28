package com.interview.designpatterns.decorators.product;

class ShippingDecorator extends ProductDecorator {
    public ShippingDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("--> Shipping the product.");
    }
}
