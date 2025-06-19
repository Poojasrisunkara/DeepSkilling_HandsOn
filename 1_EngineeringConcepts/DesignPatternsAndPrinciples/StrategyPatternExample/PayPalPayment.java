package DesignPatternsAndPrinciples.StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying though PayPal.");
    }
}
