package comperatorandrunnable;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		/*
		 * Prior Java 8
		 */
		
		Comparator<Integer> integerComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {				
				return o1.compareTo(o2);
			}
			
		};
		
		System.out.println("Result of the comparator: " + integerComparator.compare(3, 2));
		
		
		/*
		 * Lambda
		 */
		
		Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
		
		System.out.println("Result of the comparator - Lambda: " + comparatorLambda.compare(3, 2));
		
	}

}
