package Lab9.prob8;
import java.util.*;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println("/*--Q1--*/");
		transactions.stream()
					.filter(t->t.getYear()==2011)
					.sorted((t1,t2)->((Integer)t1.getValue()).compareTo(t2.getValue()))
					.forEach(System.out::println);;

        
        // Query 2: What are all the unique cities where the traders work?
		System.out.println("\n/*--Q2--*/");   
		transactions.stream()
					.map(t->t.getTrader())
					.map(t->t.getCity())
					.distinct()
					.forEach(System.out::println);;

        // Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println("\n/*--Q3--*/");   
		transactions.stream()
			.map(t->t.getTrader())
			.filter(t->t.getCity() == "Cambridge")
			.map(t->t.getName())
			.distinct()
			.sorted((t1,t2)->t1.compareTo(t2))
			.forEach(System.out::println);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println("\n/*--Q4--*/");   
		transactions.stream()
			.map(t->t.getTrader())
			.map(t->t.getName())
			.distinct()
			.sorted((t1,t2)->t1.compareTo(t2))
			.forEach(System.out::println);
        // Query 5: Are there any trader based in Milan?
		System.out.println("\n/*--Q5--*/");   
		Optional<Trader> fromCity =  transactions.stream()
			.map(t->t.getTrader())
			.filter(t->t.getCity() == "Milan")
			.findAny();
		System.out.println(fromCity.isEmpty()?"No":"Yes");
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		System.out.println("\n/*--Q6--*/");   
		transactions.stream()
					.map(t->t.getTrader())
					.filter(t->t.getCity() == "Milan")
					.forEach(t->t.setCity("Cambridge"));
		System.out.println(transactions);
        
        // Query 7: What's the highest value in all the transactions?
		System.out.println("\n/*--Q7--*/");   
		Optional<Transaction> max = transactions.stream()
				.max((t1,t2)->((Integer) t1.getValue()).compareTo(t2.getValue()));
		System.out.println(max.get().getValue());
    }
}
