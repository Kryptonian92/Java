import java.util.Scanner;

public class PythagoreanTest{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int a = reader.nextInt();
		System.out.println("Enter your first number: ");
		int b = reader.nextInt();

		Pythagorean class1 = new Pythagorean();
		class1.calculateHypotenuse(a, b);
	}
}