package Lab8.prob4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

public class LambdaMethodRef {
	public static void main(String[] args) {
		String fname = "Tom";
		String lname = "Bruce";
		// Imperative code
		String com = fname + " " + lname;
		System.out.println(com);

		/*
		 * Task 1 - Must provide a space between first and last name a) Convert the
		 * concatenation task of imperative code to lambda, which takes two string
		 * inputs and return a string. b) Do the same using Method Reference c) Print
		 * the result on console by invoking the Lambda and
		 */
		// lambda
		BiFunction<String, String, String> formFullName = (f, l) -> f + " " + l;
		System.out.println("Lambda: " + formFullName.apply(fname, lname));

		// method reference
		BiFunction<String, String, String> formFullName2 = LambdaMethodRef::formFullName;
		System.out.println("Method Reference: " + formFullName2.apply(fname, lname));

		String[] names1 = { "Alexis", "Tim", "Kyleen", "Bruce", "tom" };
		// Imperative code - Using Arrays.sort with an anonymous Comparator to ignore
		// case
		Arrays.sort(names1, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2); // Ignore case during comparison
			}
		});
		System.out.println("/*-------Sored list using imperative-----*/");
		for (String name : names1) {
			System.out.println(name);
		}

		/*
		 * Task-2 a. Use Arrays.sort() to sort the names by ignore case using lambda for
		 * the above imperative style of code. b. Use Arrays.sort() to sort the names by
		 * ignore case using Method reference. c. Print the sorted list on console
		 */

		// lambda
		Arrays.sort(names1, (str1, str2) -> str1.compareToIgnoreCase(str2));
		System.out.println("/*----lambda-----*/");
		for (String name : names1) {
			System.out.println(name);
		}

		// method reference
		Arrays.sort(names1, LambdaMethodRef::sortArrayIgnoreCase);
		System.out.println("/*----method reference-----*/");
		for (String name : names1) {
			System.out.println(name);
		}

	}

	public static String formFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static int sortArrayIgnoreCase(String str1, String str2) {
		return str1.compareToIgnoreCase(str2);
	}
}
