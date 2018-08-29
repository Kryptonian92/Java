public class StringManipulator {
	public void trimAndConcat(String word1, String word2){
		System.out.println(word1.trim() + word2.trim());		
	}
	//gets the index of a character or string within a string
	public void getIndexOrNull(String word, String letter){
		Integer a = word.indexOf(letter);
		if(a>-1){
			System.out.println(a);
		}else{
			System.out.println("Null");
		}
	}
	//takes in two strings. Gets a sub string from the first string and concats it to the second string
	public void concatSubstring(String word1, int a, int b, String word2){
		String word = word1.substring(a, b);
		System.out.println(word + word2);
	}
}
