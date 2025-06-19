package DesignPatternsAndPrinciples.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
    public void pay(){
        System.out.println("Paying through credit card.");
    }
}
