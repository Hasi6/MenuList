package com.company;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("Basic","Sausage",5.30,"White");
        double price = burger.itemizedburger();
        burger.addBurgerAddition1("Tomato",2.20);
        burger.addBurgerAddition2("BBQ",3.40);
        burger.addBurgerAddition3("Cheese",1.90);
        System.out.println("Total burger price is: "+burger.itemizedburger());

        HealthyBurger healthyburger = new HealthyBurger("Bacon",6.70);

        healthyburger.addHealthAddition1("Egg",3.40);
        healthyburger.addHealthAddition1("Beef",9.40);
        System.out.println(healthyburger.itemizedburger());
        System.out.println("Total Healthy Burger price is "+healthyburger.itemizedburger());

    }
}
