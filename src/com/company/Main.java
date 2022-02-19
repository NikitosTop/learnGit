package com.company;

import java.util.*;

public class Main {

    private static List<A> users;

    public Main(){
        users = new ArrayList<>();
    }

    public static void main(String[] args) {

        Main main = new Main();

        A nikita = new A("Nikita", 19);
        A julia = new A("julia", 21);

        users.add(nikita);
        users.add(julia);

        users.forEach(System.out::println);
    }

}

class A implements Comparable<A>{

    private String name;
    private Integer age;

    public A(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(A o) {
        return this.age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class B extends A{

    public B(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

