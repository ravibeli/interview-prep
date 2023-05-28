package com.interview;

import com.interview.corejava.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class InterviewPrepApplication {

    public static void main(String[] args) {

        String s1 = new String("Ravi");
        String s2 = "Ravi";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));
        System.out.println(s2 == s1);

    }

    void display() {
        Product p1 = new Product("100", "Novel Book-1", "Entertainment", 100);
        Product p2 = new Product("101", "Java-1", "IT", 200);
        Product p3 = new Product("102", "Jokes-1", "Entertainment", 50);
        Product p4 = new Product("103", "Horror Story-1", "Entertainment", 40);

        List<Product> list = List.of(p1, p2, p3, p4);

        Comparator<String> byLength = Comparator.comparing(String::length);
        // Map<City, String> longestLastNameByCity = people.stream()
        // .collect(groupingBy(Person::getCity, reducing("", Person::getLastName, BinaryOperator.maxBy(byLength))));

        //list.stream().collect(Product::getType)


        //Comparable
        //Comparator

        //SpringApplication.run(InterviewPrepApplication.class, args);
    }


}
