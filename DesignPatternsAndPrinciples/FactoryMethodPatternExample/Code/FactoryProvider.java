package DesignPatternsAndPrinciples.FactoryMethodPatternExample.Code;
public class FactoryProvider {
    public static DocumentFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "word": return new WordDocumentFactory();
            case "pdf": return new PdfDocumentFactory();
            case "excel": return new ExcelDocumentFactory();
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}

