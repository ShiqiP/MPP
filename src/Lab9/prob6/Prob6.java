package prob6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Prob6 {

	
	// Using Flatmap
//	public static Set<String> union(List<Set<String>> sets) 
//	{
//		return sets.stream().flatMap(x->x.stream()).collect(Collectors.toSet());
//	}
	
	// Using Reduce
	public static Set<String> union(List<Set<String>> sets) 
	{
		return sets.stream().reduce(new HashSet<>(),(x,y)->{x.addAll(y);  return x;}) ;         
	}
	
	public static void main(String[] args) {
		
		Set<String> set1  = Set.of("A", "B");
		Set<String> set2  = Set.of("D");
		Set<String> set3  = Set.of("1", "3","5");
		
		List<Set<String>> list = new ArrayList<Set<String>>();
		list.add(set1);
		list.add(set2);
		list.add(set3);
		
		Set<String> oneSet = union(list);
		
		System.out.println(oneSet.toString());
		
		 
//		Example: The union method should transform the list [{“A”, “B”}, {“D”}, {“1”, “3”, “5”}] 
//				to the set {“A”, “B”, “D”, “1”, “3”, “5”}. 
	}

}
