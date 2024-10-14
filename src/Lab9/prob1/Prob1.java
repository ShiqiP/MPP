package prob1;

import java.util.ArrayList;
import java.util.List;

public class Prob1 {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("Java");
		words.add("Python");
		words.add("Javascript");
		words.add("Java");
		
		Prob1 obj = new Prob1();
		int count = obj.countWords( words, 'J', 'c', 4);
		System.out.println(count);
		
	     
	}
	
	
	
	public int countWords(List<String> words, char c, char d, int len)
	 {
		 long count = words.stream()
		 .filter(x->x.length()==len)
		 .filter(x->x.contains(String.valueOf(c)))
		 .filter(x->!x.contains(String.valueOf(d)))
		 .count();
		 return (int)count;
	 }

}
