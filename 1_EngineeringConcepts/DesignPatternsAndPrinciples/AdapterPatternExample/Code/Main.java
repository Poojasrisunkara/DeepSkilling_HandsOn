package DesignPatternsAndPrinciples.AdapterPatternExample.Code;

public class Main {
    public static void main(String[] args){
        StripeAdapter constr1 = new StripeAdapter(new Stripe());
        constr1.processPayment(540);

        SquareAdapter constr2 = new SquareAdapter(new Square());
        constr2.processPayment(389.99);
    }
}
