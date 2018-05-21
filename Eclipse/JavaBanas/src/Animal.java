// Single line comment
/* ljfl dkjaf ;d
 * 
 */

import java.util.Scanner;
//import java.util.*;
public class Animal {
	
	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner(System.in);

	public Animal() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " +  sumOfNumbers);
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " +  diffOfNumbers);
		
		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " +  multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " +  divOfNumbers);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " +  modOfNumbers);
		
		System.out.println("Enter the name: \n");
		
		if(userInput.hasNextLine()){
			
			this.setName(userInput.nextLine());
		}
		
		this.setFavoriteColor();
		this.uniqueID();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to:" + this.uniqueID);
	}
	
	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		
		this.uniqueID = minNumber + (long) (Math.random() *((maxNumber - minNumber)+1));
		String stringNumber = Long.toString(maxNumber);
		
		int numberString = Integer.parseInt(stringNumber);
		System.out.println("Unique ID set to:" + this.uniqueID);

	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random() * 126) + 1;
	
		
		this.favoriteChar = (char) randomNumber;
		
		if(randomNumber == 32){
			System.out.println("Favorite character set to Space");
		}else if(randomNumber == 10){
			System.out.println("Favorite character set to Newline");
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public static void main (String[] args){
		Animal theAnimal = new Animal();
		
	}
}
