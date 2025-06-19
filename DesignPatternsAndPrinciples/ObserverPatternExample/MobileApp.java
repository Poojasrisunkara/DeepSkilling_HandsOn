package DesignPatternsAndPrinciples.ObserverPatternExample;

public class MobileApp implements Observer{
    private String Id;

    public MobileApp(String Id) {
        this.Id = Id;
    }

    public void update(String stockName, double newPrice) {
        System.out.println("[" + Id + "] " + stockName + " updated to rupees" + newPrice);
    }
}
