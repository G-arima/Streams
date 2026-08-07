package filtersdemo;

import java.util.Arrays;
import java.util.List;

public class Pgm10 {

	public static void main(String[] args) {
		//Names longer than 5 characters
		List<String> names = Arrays.asList(
        "Ram",
        "Shivam",
        "Ankit",
        "Alexander",
        "Raj");
		names.stream().filter(str->str.length()>5).forEach(str->System.out.println(str));
		
	}
	//Shivam, Alexander
	

}
