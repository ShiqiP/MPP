package Lab9.prob7;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


public class LambdaLibrary {
	public static final MyFunction<List<Employee>,Character,Integer, String>  FILTER_NAME_SALARY = (list,c,salary)->
		list.stream()
			.filter(e->e.getSalary() > salary)
			.filter(e->e.getLastName().charAt(0) > c)
			.sorted((e1,e2)->e1.getFirstName().compareTo(e2.getFirstName()))
			.map(e->e.getFirstName()+" " +e.getLastName())
			.collect(Collectors.joining(","));
		
//	public static final BiFunction<List<Employee>,Integer,List<Employee>> FILTER_SALARY = (list,salary)->
//		list.stream().filter(e->e.getSalary()>salary).collect(Collectors.toList());
}
