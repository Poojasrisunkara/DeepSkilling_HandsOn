package DesignPatternsAndPrinciples.DependencyInjectionExample.Code;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.displayCustomer(101);
        service.displayCustomerName(101);
    }
}
