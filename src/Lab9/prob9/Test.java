package Lab9.prob9;

import java.util.Optional;
import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) {
		System.out.println("\na. Is there any Vegetarian meal available");
		boolean a = Dish.menu
			.stream()
			.anyMatch(m->m.isVegetarian());
		System.out.println(a);
		
		System.out.println("\nb.Is there any healthy menu have calories less than 1000 ");
		boolean b = Dish.menu
				.stream()
				.anyMatch(m->m.getCalories() < 1000);
		System.out.println(b);
		
		System.out.println("\nc.Is there any unhealthy menu have calories greater than 1000");
		boolean c = Dish.menu
				.stream()
				.anyMatch(m->m.getCalories() > 1000);
		System.out.println(c);
		
		System.out.println("\nd.find and return the first item for the type of MEAT");
		Optional<Dish> d = Dish.menu
								.stream()
								.filter(m->m.getType() == Dish.Type.MEAT)
								.findFirst();
		System.out.println(d.get());
		
		
		System.out.println("\ne. calculateTotalCalories() in the menu using reduce");
		int e = Dish.menu
				.stream()
				.map(m->m.getCalories())
				.reduce(0,(c1,c2)->c1+c2);
		System.out.println(e);
		
		System.out.println("\nf. calculateTotalCaloriesMethodReference()in the menu using MethodReferences.");
		Supplier<Integer> f = Dish::calculateTotalCaloriesMethodReference;
		System.out.println(f.get());
	}
}
