package DesignPatternsAndPrinciples.ProxyPatternExample;

public class Main {
    public static void main(String[] args){
        ProxyImage img = new ProxyImage("Cogni");
        img.display();
        System.out.println("sending the same file...");
        img.display();

        ProxyImage anotherImg = new ProxyImage("File625");
        anotherImg.display();
    }
}
