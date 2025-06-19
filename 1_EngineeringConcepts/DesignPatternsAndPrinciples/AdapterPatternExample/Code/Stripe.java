package DesignPatternsAndPrinciples.AdapterPatternExample.Code;

public class Stripe{
    public void StripeProcessPayment(double amount){
        System.out.println("Your payment of rupees " + amount + " processed using Stripe gateway");
    }
}
