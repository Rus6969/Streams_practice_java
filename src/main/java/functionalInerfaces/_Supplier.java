package functionalInerfaces;

import java.util.List;
import java.util.function.Supplier;

/*
Supplier is used Represents supplier results, returns any result u want any data type is available
 */
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getJDBCSupl);
        System.out.println(getConnectionURL());
        System.out.println(getJDBCSuplList);

    }


   /// imperative
    static String getConnectionURL (){
        return"jdbc://localhost/8546/users";
    }



    //declarative

  static   Supplier<String> getJDBCSupl= ()-> "jdbc://localhost/8546/users";
  static   Supplier<List<String>> getJDBCSuplList= ()-> List.of("jdbc://localhost/8546/users","test1");
}
