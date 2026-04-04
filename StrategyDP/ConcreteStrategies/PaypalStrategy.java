package javaapplication3.StrategyDP.ConcreteStrategies;

import javaapplication3.StrategyDP.Strategy.PayementStrategy;

public class PaypalStrategy implements PayementStrategy {

    private String name;


    public PaypalStrategy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void pay(double credit) {
        System.out.println("user : "+name+" payed : "+credit);
    }
}
