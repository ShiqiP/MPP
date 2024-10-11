package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Problem1 {

	public static void main(String[] args) {
		// To understand functions as First class citizen
		 List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		 // Task 1: Identify the suitable interface to read the input and print doubled
//		 changeDouble(numbers /* , Functional Interface implementation*/ );// Output: 2 4 6 8 10
		 Function<Integer,Integer> getDouble = (x)-> x*2;
		 changeDouble(numbers , getDouble );// Output: 2 4 6 8 10
		 
	
		 List<String> data = Arrays.asList("apple", "banana", "cherry");
	     //Task 2: Take input of String and transform into Upper case  
		 
	     Function<String, String> toUpper = s -> s.toUpperCase();
		 transformStrings(data, toUpper);
		 
		 // Task 3: Check the inputs of given value is divisible by 5.
		 List<Integer> inputs = Arrays.asList(10, 21, 12, 25, 33);
		 Predicate<Integer> is5Divisible = (x)-> x%5==0;
	        printIf(inputs , is5Divisible);
	}

	public static void changeDouble(List<Integer> numbers , Function<Integer,Integer> getDouble) {
        for (Integer number : numbers) {
            //action.accept(number);
        	Integer n= (Integer) getDouble.apply(number);
        	System.out.println(n);
        }
	}
	public static void transformStrings(List<String> list,  Function<String,String> transform) {
        for (String s : list) {
          System.out.println(transform.apply(s));
        }
    }
	public static void printIf(List<Integer> numbers, Predicate<Integer> condition) {
        for (Integer number : numbers) {
            if (condition.test(number)) {
                System.out.println(number);
            }
        }
    }
}


