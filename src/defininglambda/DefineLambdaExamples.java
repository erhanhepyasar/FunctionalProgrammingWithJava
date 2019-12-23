package defininglambda;

public class DefineLambdaExamples {

	public static void main(String[] args) {
		
		// Example-1
		GreetLambda greetLambda = () -> System.out.println("Greetings from lambda function");
		greetLambda.greet();
			

		// Example-2
		AddIntegers addIntegers = (a, b) -> a + b;
		int c = addIntegers.addIntegers(3, 4);
		System.out.println(c);
		
		// Example-3
		StringLengthLambda stringLengthLambda = s -> s.length();
		int lenStr = stringLengthLambda.getLength("This is a test string");
		System.out.println(lenStr);
		
		printLambda(stringLengthLambda);
		printLambda(s -> s.length());
		
	}
	
	public static void printLambda(StringLengthLambda stringLengthLambda) {
		System.out.println(stringLengthLambda.getLength("Test string123"));
	}

}



@FunctionalInterface  // This optional annotation ensures interface has and only has one abstract method which is the condition of creating lambda expressions
interface GreetLambda {
	void greet();
	
}

@FunctionalInterface
interface AddIntegers {
	int addIntegers(int a, int b);
}

@FunctionalInterface
interface StringLengthLambda {
	int getLength(String s);
}
