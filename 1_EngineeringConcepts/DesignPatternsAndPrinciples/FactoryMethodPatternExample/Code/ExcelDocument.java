package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;

public class ExcelDocument implements Document{
    public void open(){
        System.out.println("Opening as Excel Document!");
    }
}
