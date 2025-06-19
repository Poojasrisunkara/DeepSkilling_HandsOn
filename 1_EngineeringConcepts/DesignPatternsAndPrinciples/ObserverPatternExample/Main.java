package DesignPatternsAndPrinciples.ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("M-User123");
        Observer webUser = new WebApp("W-User456");

        market.register(mobileUser);
        market.register(webUser);

        System.out.println("--- Updating INFY ---");
        market.setPrice("INFY", 1634.45);

        System.out.println("\n--- Updating TCS ---");
        market.setPrice("TCS", 3821.70);

        market.deregister(mobileUser);

        System.out.println("\n--- Updating HDFC (only WebApp will be notified) ---");
        market.setPrice("HDFC", 1680.00);
    }
}
