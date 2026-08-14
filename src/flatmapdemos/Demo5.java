package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
			    "Java is easy",
			    "Streams are powerful",
			    "I am learning Java");
		//Each sentence contains multiple words.
        //We want to get all words separately.
	/*List<String[]> result=	sentences.stream().map(sentence->sentence.split(" ")).collect(Collectors.toList());
		System.out.println(result.toString());*/
	List<String> words=sentences.stream().flatMap(sentence->Arrays.stream(sentence.split(" "))).collect(Collectors.toList());
	System.out.println(words);

	}

}
