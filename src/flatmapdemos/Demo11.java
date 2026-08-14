package flatmapdemos;

import java.util.Arrays;
import java.util.List;

public class Demo11 {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
			    "java selenium",
			    "java streams",
			    "selenium automation"
			);
		sentences.stream().flatMap(sentence->Arrays.stream(sentence.split(" "))).distinct().forEach(word->System.out.println(word));;

			/*Use flatMap() to get unique words.

			Expected:

			java
			selenium
			streams
			automation*/

	}

}
