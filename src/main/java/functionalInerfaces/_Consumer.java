package functionalInerfaces;

import java.util.function.Consumer;

/*
Consumer interface takes one argument and will not return result
 */
public class _Consumer {


    public static void main(String[] args) {
       Customer inna = new Customer("Inna","451578");
        // imperative
        greetCustomer(inna);

         // Declarative
        greetCustomerConsumer.accept(inna);

    }

    // imperative way
    static void greetCustomer(Customer customer) {
        System.out.println("Hello "
                + customer.customerName + " thnaks for regestering + " + customer.customerPhone);
    }

    // declarative way
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello "
            + customer.customerName + " thnaks for regestering + " + customer.customerPhone);

// test data static class to create an object customer
    static class Customer {
        private final String customerName;
        private final String customerPhone;

        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
