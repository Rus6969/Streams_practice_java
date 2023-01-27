package functionalInerfaces;

import java.util.function.Function;

/*
Functional Interface
• Known as SAM (Single Abstract Method) interface • There is only one abstract method in interface.
• @FunctionalInterfaceis applicable (Optional)
• Effectively acts as a function
works like any method accepts argument and returns result
 */
public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(1));
        System.out.println(increment_Fuctional_Interface.apply(1));


        //  And(then) is used to combine 2 functions togather in one method
        System.out.println(addBy1andMultiplyByTen.apply(1));


    }


    // those  to methods are same, imperative approach

    static int increment(int number) {
        return number + 1;
    }

            //       input    output      declarative approach
           static Function<Integer, Integer> increment_Fuctional_Interface = number -> number + 1;

    static Function<Integer, Integer> MultiplyBy10_Fuctional_Interface = number -> number * 10;


    //  And(then) is used to combine 2 functions togather in one method

    static Function<Integer, Integer> addBy1andMultiplyByTen = increment_Fuctional_Interface.andThen(MultiplyBy10_Fuctional_Interface);
}
