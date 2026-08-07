package filtersdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm3_FilterDemo3 {

	public static void main(String[] args) {
		//Scenario is to filter out the null values from the collection
		List<String> words=Arrays.asList("cup","forest","babyhug",null,"sipper","nature",null,"trees");
		List<String> result=new ArrayList();
		result=words.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println("The required filtered list after removing the null values is : " +result);
	}

}
