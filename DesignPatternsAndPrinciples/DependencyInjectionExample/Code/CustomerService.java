package DesignPatternsAndPrinciples.DependencyInjectionExample.Code;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(int id) {
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }

    public void displayCustomerName(int id) {
        String name = customerRepository.getCustomerNameById(id);
        System.out.println("Customer Name via Shortcut: " + name);
    }
}
