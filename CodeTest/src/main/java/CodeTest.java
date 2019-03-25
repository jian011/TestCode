
public class CodeTest {
	public static void fun1() {
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public static void fun2() {
		for (int i = 1; i <= 100; i++) {
			
			if (((i % 3 == 0) && (i % 5 == 0)) ||
					String.valueOf(i).contains("35") ||
					String.valueOf(i).contains("53")) {
				System.out.println("FizzBuzz");
			} else if(String.valueOf(i).contains("3") ||
					(i % 3 == 0)) {
				System.out.println("Fizz");
			} else if (String.valueOf(i).contains("5") ||
					((i % 5 == 0))) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
