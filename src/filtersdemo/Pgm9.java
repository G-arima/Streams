package filtersdemo;

import java.util.Arrays;
import java.util.List;

public class Pgm9 {

	public static void main(String[] args) {
		// Names Starting With "A"
		List<String> names = Arrays.asList(
		        "Amit",
		        "Rahul",
		        "Ankit",
		        "Neha",
		        "Ajay");
		//Amit, Ajay
		names.stream().filter(str->str.startsWith("A")).forEach(str->System.out.println(str));

	}

}
