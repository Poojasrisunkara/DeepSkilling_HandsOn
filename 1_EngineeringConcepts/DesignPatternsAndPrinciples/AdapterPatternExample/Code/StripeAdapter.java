package DesignPatternsAndPrinciples.AdapterPatternExample.Code;

public class StripeAdapter implements PaymentProcessor{
    private Stripe stripe;
    public StripeAdapter(Stripe stripe){
        this.stripe = stripe;
    }
    public void processPayment(double amount){
        stripe.StripeProcessPayment(amount);
    }
}
