package callbackLikeJS;

import java.util.function.Consumer;

/*
A callback function is a function passed into another function as an argument,
which is then invoked inside the outer function to complete some kind of routine or action.

JS example:
function isOdd(number) {
  return number % 2 != 0;
}

function filter(numbers, fn) {
  let results = [];
  for (const number of numbers) {
    if (fn(number)) {
      results.push(number);
    }
  }
  return results;
}
let numbers = [1, 2, 4, 7, 3, 5, 6];
console.log(filter(numbers, isOdd));
 */
public class Main {
    public static void main(String[] args) {
        //hello("Ruslan","Samatov",null);


        hello("Ruslan",null,value->{
            System.out.println("no last name provided for "+ value);
        });


        hello2("Ruslan",null,()->{
            System.out.println("no last name provided for ");
        });


    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {

        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }else{
            callback.accept(firstName);
        }

    }

// runnable if we do not want pass an argument as a value in example above
    static void hello2(String firstName, String lastName, Runnable callback) {

        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }else{
            callback.run();
        }

    }
}