package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;

public class WordDocument implements Document{
    public void open(){
        System.out.println("Opening as Word Document!");
    }
}
