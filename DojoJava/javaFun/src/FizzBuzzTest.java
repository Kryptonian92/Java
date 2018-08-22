import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number divisable by 3 or 5: ");
		int a = reader.nextInt();
		FizzBuzz buzz = new FizzBuzz();
		buzz.fizzBuzz(a);
	}
}
