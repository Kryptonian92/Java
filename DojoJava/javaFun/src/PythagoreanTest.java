import java.util.Scanner;
//program to calculate the hypotenuse of a triangle given side a and b
public class PythagoreanTest{
	public static void main(String[] args){
		//scanner method for user input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter side A of your triangle: ");
		//saving user input as varaibles a & b
		int a = reader.nextInt();
		System.out.println("Enter side B of your triangle: ");
		int b = reader.nextInt();
		
		//calling fist method in Pythagorean file
		Pythagorean class1 = new Pythagorean();
		class1.calculateHypotenuse(a, b);
	}
}