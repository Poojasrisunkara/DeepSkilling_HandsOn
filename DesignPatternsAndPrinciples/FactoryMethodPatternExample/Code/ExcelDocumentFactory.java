package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;

public class ExcelDocumentFactory extends DocumentFactory {
    public Document CreateDocument(){
        return new ExcelDocument();
    }
}


