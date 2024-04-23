package org.example;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Торт");
        Product p2 = new Product("Ванилин");
        Product p3 = new Product("Какао");
        Product p4 = new Product("Тесто");
        Product p5 = new Product("Кофеин");
        Product p6 = new Product("Вода");
        Product p7 = new Product("Мука");
        Product p8 = new Product("Яйца");


        System.out.println(p1.addComponent(p2));
        System.out.println(p1.addComponent(p3));
        System.out.println(p1.addComponent(p4));
        System.out.println(p3.addComponent(p5));
        System.out.println(p3.addComponent(p6));
        System.out.println(p4.addComponent(p7));
        System.out.println(p4.addComponent(p8));
        System.out.println(p4.addComponent(p6));


    }
}