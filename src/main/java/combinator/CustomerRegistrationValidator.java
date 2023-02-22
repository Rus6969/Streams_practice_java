package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinator.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {
    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@")?ValidationResult.SUCCESS:EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isDobValid(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>16 ?SUCCESS:IS_NOT_ADULT;
    }

   default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
     return customer -> {  ValidationResult result =
         this.apply(customer);
         return  result.equals(SUCCESS)? other.apply(customer):result;
     };
   }
    enum ValidationResult{
    SUCCESS,PHONE_NUMBER_INVALID, IS_NOT_ADULT,EMAIL_NOT_VALID ;
    }
}
