package functionalInerfaces;

import java.util.function.Predicate;

// Boolean valued functions with one argument
public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("070"));
        System.out.println("--------------Predicate-----------------------");

        System.out.println(isValidPredicate.test("07985"));
        System.out.println("************Combined_Predicates****************");
        // predicates can be combined
        System.out.println(isValidPredicate.and(containNumber3).test("07030000000"));
    }


    static boolean isPhoneNumberValid(String phonenumer){
        return phonenumer.startsWith("07")&& phonenumer.length()==11;

    }
    static Predicate<String> isValidPredicate =phoneNum->phoneNum.startsWith("07") && phoneNum.length()== 11;

    static Predicate<String> containNumber3 =phoneNum->phoneNum.contains("3");





}
