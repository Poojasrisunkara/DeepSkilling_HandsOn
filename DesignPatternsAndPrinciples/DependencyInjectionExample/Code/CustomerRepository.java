package DesignPatternsAndPrinciples.DependencyInjectionExample.Code;

public interface CustomerRepository {
    Customer findCustomerById(int Id);
    String getCustomerNameById(int id);
}
