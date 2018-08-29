//program to practice manipulating strings
public class StringManipulatorTest {
	public static void main(String[] args){
		StringManipulator class1 = new StringManipulator();
		class1.trimAndConcat("   Hello   ", "   World   ");
		class1.getIndexOrNull("Hello","world");
		//passing in 2 strings and start & and positions 
		class1.concatSubstring("Hello", 1, 2, "World");
	}
}
