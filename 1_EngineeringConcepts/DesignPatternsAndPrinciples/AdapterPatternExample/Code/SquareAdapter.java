package DesignPatternsAndPrinciples.AdapterPatternExample.Code;

public class SquareAdapter implements PaymentProcessor {
    private Square square;
    public SquareAdapter(Square square){
        this.square = square;
    }
    public void processPayment(double amount){
        square.SquarePayment(amount);
    }
}
