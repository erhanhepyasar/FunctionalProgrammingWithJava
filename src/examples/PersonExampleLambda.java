package examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonExampleLambda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// 1. Sort list by last name		
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName())); 
		
		
		// 2. Create a method that prints all elements in the list
		System.out.println("\nPrinting all people");
		printConditionally(people, p -> true);
		
		// 3. Create a method that prints all people that have last name beginning with C
		
		System.out.println("\nPrinting people last name beginning with \"C\" - 2nd way");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("\nPrinting people first name beginning with \"T\" - 2nd way");
		printConditionally(people, p -> p.getFirstName().startsWith("T"));
			
	

	}
	
	private static void printConditionally (List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}

