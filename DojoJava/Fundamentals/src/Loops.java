//Practicing fundamentals of loops
import java.util.ArrayList;
public class Loops {
	public void forLoop(){
		int i=0;
		int j=0;
		ArrayList<String> dynamicArray = new ArrayList<String>();
		for (i=0; i<11; i++){
			System.out.println(i);
		}
		while(j<7){
			System.out.println("foo");
			j++;
		}
		dynamicArray.add("hello");
		dynamicArray.add("world");
		dynamicArray.add("etc");
		for (int h=0; h<dynamicArray.size(); h++){
			System.out.println(h);
			System.out.println(dynamicArray.get(h));
		}
		//assiging array values to a variable on the fly
		for(int k=0; k<dynamicArray.size(); k++){
			String name = dynamicArray.get(k);
			System.out.println("Hello " + name);
		}
		
		//Enhanced for loops
		for(String name : dynamicArray){
			System.out.println(name);
		}
		String newArr[] = {"one", "tow", "apples"};
		for(String val : newArr){
			System.out.println(val);
		}
		Object allArray[] = {"one", 4, "apples", "55", 55, 67.88};
		for(Object arrVal : allArray){
			System.out.println(arrVal);
		}
	}
}
