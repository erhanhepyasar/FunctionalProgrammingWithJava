package imperativedeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
		System.out.println("integerList: " + integerList);
		
		/*
		 * Imperative
		 */
		List<Integer> uniqueList1 = new ArrayList<>();
		for (Integer integer : integerList) {
			if(!uniqueList1.contains(integer)) {
				uniqueList1.add(integer);
			}
		}
		
		System.out.println("uniqueList - imperative: " + uniqueList1);
		
		/*
		 * Declarative
		 */
		List<Integer> uniqueList2 = integerList.stream()
					.distinct()
					.collect(Collectors.toList());
		
		System.out.println("uniqueList - declarative: " + uniqueList2);
		

	}

}
