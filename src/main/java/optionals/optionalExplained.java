package optionals;

import java.util.Optional;

public class optionalExplained {
    public static void main(String[] args) {
  /*
  The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.
  The class was introduced in the java.util package to remove the need for multiple null checks to protect against
  the dreaded NullPointerExceptions during run-time.
   */
        Optional<Object> empty = Optional.empty();// will return empty
        // uncomment me for nullable tests
        Optional<String> hello1 = Optional.ofNullable("Hello");
       // Optional<String> hello1 = Optional.ofNullable(null);
        System.out.println("Is_Present*/*/*/*/*/*/*/*/*/*/");
        System.out.println(hello1.isPresent());
        System.out.println("/*/*/*/*/*Or_Else/*/*/*/*/*/");
        String inCaseHelloNotPresent = hello1.orElse("Bye! ");
        System.out.println(inCaseHelloNotPresent);

        // using streams and lambda
        String OrElse= hello1
                .map(String::toUpperCase)
                // or else is supplier we can add any logic to give as stadard else in if else statement
                .orElseGet(()->{
                            String hello = "Hello";
                            return hello;
                        }
                );





    }
}