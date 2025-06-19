package DesignPatternsAndPrinciples.StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        strategy.pay(); 
    }
}
