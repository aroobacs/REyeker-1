public class Factorial {
public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	static int factorial(int num) {
		int result = 1;
		for (int i = 2; i <= num; i++)
			result *= i;
		return result;
	}

	
}
