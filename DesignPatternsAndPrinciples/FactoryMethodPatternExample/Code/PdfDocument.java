package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;

public class PdfDocument implements Document{
    public void open(){
        System.out.println("Opening as Pdf Document!");
    }
}
