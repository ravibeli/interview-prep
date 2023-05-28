package com.interview.designpatterns.decorators.product;

// Decorator abstract class
abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public void process() {
        decoratedProduct.process();
    }
}
