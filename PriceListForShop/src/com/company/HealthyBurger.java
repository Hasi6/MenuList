package com.company;

public class HealthyBurger extends Burger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizedburger() {
       double burgerPrice = super.itemizedburger();
       if(!(this.healthyExtra1Price == 0)){
           System.out.println("Added "+this.healthyExtra1Name+" for an extra "+this.healthyExtra1Price);
       }
        if(this.healthyExtra2Price != 0){
            System.out.println("Added "+this.healthyExtra2Name+" for an extra "+this.healthyExtra2Price);
        }
        return burgerPrice;
    }
}
