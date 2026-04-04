package javaapplication3.StrategyDP.Context;

import javaapplication3.StrategyDP.Strategy.PayementStrategy;

public class PaymentService {

   private PayementStrategy payementStrategy;

    public PaymentService(PayementStrategy payementStrategy) {
        this.payementStrategy = payementStrategy;
    }

    public PaymentService() {
    }

    public void setPayementStrategy(PayementStrategy payementStrategy) {
        this.payementStrategy = payementStrategy;
    }

    public void executeStrategy(double amount){
        payementStrategy.pay(amount);
    }


}
