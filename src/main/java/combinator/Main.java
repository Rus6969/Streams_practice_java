package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.isEmailValid;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Inna","Innushka91@gmail.com","+098745124", LocalDate.of(1994,10,5));

          CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isValisdCustomer(customer));

        // Using Combinator pattern
        CustomerRegistrationValidator.ValidationResult result =
    isEmailValid().and(CustomerRegistrationValidator.isDobValid()).apply(customer);

        if(result!= CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException("Not Valid Customer");
        }
        System.out.println(result);


    }
}
