package javaapplication3.StrategyDP.ConcreteStrategies;

import javaapplication3.StrategyDP.Strategy.PayementStrategy;

public class CreditCardPayement implements PayementStrategy {

    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CreditCardPayement(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double credit) {
        System.out.println("user with card number : "+cardNumber+" payed : "+credit);
    }
}
