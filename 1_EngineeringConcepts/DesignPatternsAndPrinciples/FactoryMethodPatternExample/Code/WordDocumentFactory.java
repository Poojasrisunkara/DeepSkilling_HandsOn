package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;

public class WordDocumentFactory extends DocumentFactory {
    public Document CreateDocument(){
        return new WordDocument();
    }
}
