package streamsExamples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class lambdas {
    public static void main(String[] args) {
        // if one return statement method reference
        Function<String, String> UpperCaseprintName = String::toUpperCase;
        // same thing
        Function<String, String> UpperCaseprintName2 = name -> name.toUpperCase();

    // we need include breakets if we we have more then one argument
        BiFunction<String,Integer,String>uppcase = (name,age)->{
            if (name.isBlank()) throw new IllegalArgumentException("No name Provided");
            System.out.println(age);
            return name.toUpperCase();

        };

   String upcase = uppcase.apply("Rus",55);

    }
}
