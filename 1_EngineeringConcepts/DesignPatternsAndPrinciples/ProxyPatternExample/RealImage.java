package DesignPatternsAndPrinciples.ProxyPatternExample;

public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
    }
    public void load(){
        System.out.println(fileName + "loaded from server");
    }
    public void display(){
        System.out.println("Displaying content loaded from " + fileName);
    }
}
