package com.interview.decorators.product;

// Concrete decorators
class PackagingDecorator extends ProductDecorator {
    public PackagingDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("--> Packaging the product.");
    }
}
