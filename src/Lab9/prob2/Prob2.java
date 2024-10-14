package prob2;

import java.util.stream.Stream;

public class Prob2 {

	public static void main(String[] args) {
		int num = 4;
		printSquares(num);
	}
	
	
	public static void printSquares(int num)
	{
		Stream.iterate(1,x->x+1).limit(num).map(x->x*x).forEach(System.out::println);
	}
	

}
