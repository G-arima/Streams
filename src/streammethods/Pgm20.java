package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm20 {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
			    "Java is easy",
			    "Streams are powerful",
			    "I am learning Java"
			);
		List<String> words=sentences.stream().flatMap(sentence->Arrays.stream(sentence.split(" "))).map(sentence->sentence.toUpperCase()).collect(Collectors.toList());
System.out.println(words);
	}

}
