package Lab9.prob7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		System.out.println("/*---Stream Pipline---*/");
		list.stream()
			.filter(e->e.getSalary() > 100000)
			.filter(e->e.getLastName().charAt(0) > 'M')
			.map(e->e.getFirstName()+" " +e.getLastName())
			.sorted((e1,e2)->e1.compareTo(e2))
			.forEach(System.out::println);;
			
		System.out.println("/*---LambdaLibrary---*/");
		System.out.println(LambdaLibrary.FILTER_NAME_SALARY.apply(list,'M', 100000));
	
	}
	
}
