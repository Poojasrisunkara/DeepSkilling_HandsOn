package DesignPatternsAndPrinciples.ObserverPatternExample;

public class WebApp implements Observer{
    private String Id;

    public WebApp(String Id) {
        this.Id = Id;
    }

    public void update(String stockName, double newPrice) {
        System.out.println("[" + Id + "] " + stockName + " updated to rupees" + newPrice);
    }
}
