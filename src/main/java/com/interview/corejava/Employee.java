package com.interview.corejava;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@EqualsAndHashCode
@ToString
@Data
@AllArgsConstructor
@Builder
public class Employee {
    private String id;
    private String name;
    private int age;
    private String city;

    public static void main(String[] args) {
        Employee e1 = new Employee( "1", "Jaggu", 29, "GLB");
        Employee e2 = new Employee( "2", "Sharan", 26, "BLR");
        Employee e3 = new Employee( "3", "Sharan", 26, "GLB");
        Employee e4 = new Employee( "4", "Ravi", 43, "HYD");
        Employee e5 = new Employee( "5", "Vinod", 39, "HYD");

        List<Employee> employees = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Map<String, List<Employee>> employeesGroupMap = new HashMap<>();

        employeesGroupMap = employees.stream().collect(Collectors.groupingBy(Employee::getCity));

        for(Map.Entry<String, List<Employee>> entry : employeesGroupMap.entrySet()) {
           // System.out.println("key:" + entry.getKey() + " "+  entry.getValue());
        }


        String s1 = "Ravi";
        String s2 = "Ravi";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }

}
