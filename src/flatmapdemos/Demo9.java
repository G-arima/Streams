package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo9 {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
			    "Java is easy",
			    "Streams are powerful",
			    "I love automation"
			);
		//Use flatMap() to print every word separately.
		for(String grpSentence : sentences)
		{
		if(grpSentence.contains(" "))
		{
			String[] arr=grpSentence.split(" ");
			for(String word:arr)
			{
				System.out.println(word);
			}
		}
		
		}
		System.out.println("*****************************************");
		List<String> words=sentences.stream().flatMap(sentence->Arrays.stream(sentence.split(" "))).collect(Collectors.toList());
		System.out.println(words);
				}

}
