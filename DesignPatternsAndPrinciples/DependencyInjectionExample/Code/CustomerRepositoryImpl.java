package DesignPatternsAndPrinciples.DependencyInjectionExample.Code;

public class CustomerRepositoryImpl implements CustomerRepository{
     public Customer findCustomerById(int id) {
        return new Customer(id, "John Sri");
    }
    
    public String getCustomerNameById(int id) {
        return findCustomerById(id).getName();
    }
}
