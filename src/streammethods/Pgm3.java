package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pgm3 {

	public static void main(String[] args) {
		// Reduce Method
		List<String> stringList=Arrays.asList("A","B","C","1","2","3");
		Optional<String> str=stringList.stream().reduce((value,combinedValue)->{return combinedValue+value;});	
System.out.println(str.get());
	}

}
