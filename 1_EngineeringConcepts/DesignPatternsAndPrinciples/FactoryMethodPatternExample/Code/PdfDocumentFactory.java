package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;

public class PdfDocumentFactory extends DocumentFactory{
    public Document CreateDocument(){
        return new PdfDocument();
    }
}
