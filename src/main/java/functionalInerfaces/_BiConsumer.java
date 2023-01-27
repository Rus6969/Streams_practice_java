package functionalInerfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// accept 2 arguments no return
public class _BiConsumer {

    public static void main(String[] args) {
       Customer1 inna = new Customer1("Inna","451578");
        // imperative
        greetCustomer(inna);

        // Declarative
        // to test tis method simply change boolean to tru/false
        greetCustomerBiConsumer.accept(inna,false);
        greetCustomerBiConsumer.accept(inna,true);

    }

    // imperative way
    static void greetCustomer(Customer1 customer) {
        System.out.println("Hello "
                + customer.customerName + " thnaks for regestering + " + customer.customerPhone);
    }

    // declarative way
    static BiConsumer<Customer1,Boolean> greetCustomerBiConsumer = (customer,showPhoneNumber) -> System.out.println("Hello "
            + customer.customerName + " thnaks for regestering + " + (showPhoneNumber ? customer.customerPhone:"*******"));

    // test data static class to create an object customer
    static class Customer1 {
        private final String customerName;
        private final String customerPhone;

        public Customer1(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
