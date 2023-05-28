package com.interview.corejava;

class A {
    private String name = funName();

    public A() {
        System.out.println("4. A Default constructor - name = "+ this.name);
    }

    public A(String name) {
        this.name = name;
        System.out.println("Parameterized constructor - name = "+ this.name);
    }

    {
        System.out.println("3. A init Block - 2");
    }

    static {
        System.out.println("1. A Static Block - 1");
    }

    public String funName(){
        return "A.funName()";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class B extends A {
    private String nameB = funName();

    private String description;


    {
        System.out.println("5. B Normal init Block ");
    }


    static {
        System.out.println("2. B static init Block ");
    }

    public B() {
        super();
        System.out.println("6. B Default constructor nameB = " + nameB);
    }

    public B(String nameB) {
        this.nameB = nameB;
        System.out.println("B Param constructor nameB = " + nameB);
    }

    public String funName() {
        return "B.funName()";
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        A a1 = new B();
        A a2 = new B();
        System.out.println(a1);
        System.out.println(a2);

    }

}