package com.interview.designpatterns.decorators.product;

// Usage example

/**
 * In this example, we have a Product interface that represents the base component in the supply chain.
 * The BasicProduct class is a concrete implementation of this interface.
 * <p>
 * The ProductDecorator is an abstract class that implements the Product interface and acts as a base decorator.
 * <p>
 * It maintains a reference to the decorated product object and delegates the calls to it.
 * The PackagingDecorator and ShippingDecorator are concrete decorators that extend the ProductDecorator class.
 * <p>
 * They add additional processing steps to the product by overriding the process() method.
 * <p>
 * In the Main class, we demonstrate how you can process a product through different stages of the supply chain.
 * <p>
 * We create instances of the base BasicProduct and then wrap them with decorators to add packaging and shipping steps.
 * <p>
 * Finally, we call the process() method on the decorated product to simulate the supply chain flow.
 * <p>
 * When you run the example, you'll see the output that reflects the sequential processing steps performed on the product.
 *
 */

public class Demo {
    public static void main(String[] args) {
        // Create a basic product
        Product basicProduct = new BasicProduct();
        basicProduct.process();

        // Add packaging to the product
        Product productWithPackaging = new PackagingDecorator(basicProduct);
        productWithPackaging.process();


        // Add packaging and shipping to the product
        Product productWithPackagingAndShipping = new ShippingDecorator(productWithPackaging);
        productWithPackagingAndShipping.process();
    }
}
