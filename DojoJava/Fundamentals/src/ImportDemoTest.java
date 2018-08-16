public class ImportDemoTest {
	public static void main (String[] args){
		ImportDemo ID = new ImportDemo();
		String currentDate = ID.getCurrentDate();
		System.out.println(currentDate);
		System.out.println(ID);
		Adding test = new Adding();
		int results =test.AddNumbers();
		System.out.println(results);
	}
}
