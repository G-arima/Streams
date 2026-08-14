package streammethods;

import java.util.Arrays;
import java.util.List;

public class Pgm9 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "garima",
			    "rahul",
			    "garima",
			    "sneha",
			    "rahul",
			    "amit"
			);
		names.stream().distinct().map(name->name.toUpperCase()).forEach(name->System.out.println(name));

	}

}
