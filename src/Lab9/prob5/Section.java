package Lab9.prob5;

import java.util.*;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		// Implement the code
		
		return stream.skip(m).limit(n-m+1);
	}

	public static void main(String[] args) {
		/*
		 * Make three calls for the streamSection() method with different inputs use
		 * nextStream() method to supply the Stream input as a first argument in
		 * streamSection() method
		 */
		System.out.println("/*--first--*/");
		streamSection(nextStream(), 0, 7).forEach(System.out::println);
		System.out.println("/*--second--*/");
		streamSection(nextStream(), 1, 9).forEach(System.out::println);
		System.out.println("/*--third--*/");
		streamSection(nextStream(), 5, 7).forEach(System.out::println);
	}

//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
