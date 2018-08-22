
public class StringDemo {
	public static void main (String[] args){
		String ninja = "Coding dojo is cool";
		String string1 = "My name is ";
		String string2 = "Ausar ";
		String string3 = string1.concat(string2);
		String ninja2 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
		String ninja1 = "Welcome to Coding Dojo!";
		int a = ninja.indexOf("Coding"); // a is 11
		int b = ninja.indexOf("co"); // b is 3
		int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found

		int length = ninja.length();
		System.out.println(string3);
		System.out.println("String length is : " + length);
		System.out.println(ninja2);
		System.out.println(a+b+c); //adds the numbers together
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		//Tow different ways to trim a string
		String sentence = "   spaces everywhere!   ";
		String sentenceTrim = sentence.trim();
		System.out.println(sentence);
		System.out.println(sentenceTrim);
		
		//Uppercase and Lowercase
		String d = "HELLO";
		String e = "world";
		String f = e.toUpperCase();
		System.out.println(d.toLowerCase()); // hello
		System.out.println(f); // WORLD
		
		//String equality
		String g = new String("word");
		String h = new String("word");
		System.out.println(g == h); // false. Not the same exact object
		System.out.println(g.equals(h)); // true, same exact characters. 
		
	}
}
