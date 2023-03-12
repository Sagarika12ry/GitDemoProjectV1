
public class Test2 {

	public static void main(String[] args) {
		String hungry = "no";
		
		if (hungry == "yes" || hungry == "Y" || hungry == "y") {
			System.out.println("eat something");
		}
		
		else if(hungry == "no" || hungry == "N" || hungry == "n") {
			System.out.println("do work...");
		}
	}

}
