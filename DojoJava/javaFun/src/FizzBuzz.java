public class FizzBuzz {
	public String fizzBuzz(int num){
//		System.out.println(num);
		if(num%5==0 && num%3==0){
			System.out.println("Fizz Buzz");
		}else if(num%3==0){
			System.out.println("Fizz");
		}else if(num%5==0){
			System.out.println("Buzz");
		}else if(num%3==0){
			System.out.println("Fizz");
		}else{
			System.out.println(num + " is not divisable by 3 or 5");
		}
		return("Done");

	}
}
