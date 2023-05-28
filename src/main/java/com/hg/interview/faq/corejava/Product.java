package com.hg.interview.faq.corejava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private String type;
    private int price;
}
