package DataStructuresAndAlgorithms.ECommercePlatformSearch.Code;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Book", "Education"),
            new Product(104, "Camera", "Electronics")
        };

        Product linearResult = ProductSearch.linearSearch(products, "Shoes");
        System.out.println("Linear Search: " + (linearResult != null ? linearResult : "Not Found"));

        ProductSearch.sortByName(products);
        
        Product binaryResult = ProductSearch.binarySearch(products, "Camera");
        System.out.println("Binary Search: " + (binaryResult != null ? binaryResult : "Not Found"));
        
    }
}
