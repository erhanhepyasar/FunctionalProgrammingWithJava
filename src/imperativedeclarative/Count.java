package imperativedeclarative;

import java.util.stream.IntStream;

public class Count {

	public static void main(String[] args) {
		
		/*
		 * Imperative - How style of programming
		 */
		
		int sum1 = 0;
		for (int i = 0; i <= 100; i++) {
			sum1 += i;
		}
		
		System.out.println("Sum using Imperative Approach: " + sum1);
		
		/*
		 * Declarative - What style of programming
		 */
		
		int sum2 = IntStream.rangeClosed(0, 100)
				.parallel()		// Optional. Makes multi-threaded, splits the values
				.sum();
		
		System.out.println("Sum using Declarative Approach: " + sum2);
		
		
	}

}
