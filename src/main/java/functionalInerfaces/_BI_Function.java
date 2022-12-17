package functionalInerfaces;

import java.util.function.BiFunction;

public class _BI_Function {
    public static void main(String[] args) {
        System.out.println(increment(4,100));



    }



    static int increment(int number,int multiplyBy) {
        return (number + 1)* multiplyBy;
    }
        //1. argument   2arg     result
     BiFunction<Integer,Integer,Integer> incrementByOneAndMultiply =
            (numberToIncrementBy1,numbermultiplyBy)-> (numberToIncrementBy1+1)*numbermultiplyBy;
}
