package DesignPatternsAndPrinciples.ObserverPatternExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket implements Stock{
    private Map<String, Double> stockPrices = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

    public void setPrice(String stockName, double newPrice) {
        stockPrices.put(stockName, newPrice);
        notifyObservers(stockName, newPrice);
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
    }

    public void notifyObservers(String stockName, double newPrice) {
        for (Observer o : observers) {
            o.update(stockName, newPrice);
        }
    }
}
