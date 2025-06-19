package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;

public class Main1 {
    public static void main(String[] args) {
        String[] types = {"word", "pdf", "excel"};

        for (String type : types) {
            DocumentFactory factory = FactoryProvider.getFactory(type);
            Document doc = factory.CreateDocument();
            doc.open();
        }
    }
}
