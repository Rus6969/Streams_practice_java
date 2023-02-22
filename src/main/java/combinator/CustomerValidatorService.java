package combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

 private   boolean isEmailValid(String email){
        return email.contains("@");

        }

    private boolean isvalidphonenumber(String phonenumber){
        return phonenumber.startsWith("+0");

    }
     private boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears()>16;
    }


   public boolean isValisdCustomer(Customer customer){
     return isEmailValid(customer.getEmail()) && isvalidphonenumber(customer.getPhoneNumber())&& isAdult(customer.getDob());
   }
    }

