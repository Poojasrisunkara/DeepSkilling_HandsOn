package DesignPatternsAndPrinciples.StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new PayPalPayment());
        context.execute();

        PaymentContext context2 = new PaymentContext(new CreditCardPayment());
        context2.execute();

        context2.setPaymentStrategy(new PayPalPayment());
        context2.execute();
    }
}
