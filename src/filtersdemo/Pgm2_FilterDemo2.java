package filtersdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm2_FilterDemo2 {

	public static void main(String[] args) {
		//Scenario is to filter out the names with length greater than 6 and lesser than 8
		List<String> namesList=Arrays.asList("Shefali","Shubham","Garima","Vaibhav");
		List<String> filteredNames=new ArrayList();
		//Using the foreach loop
		/*for(String str:namesList)
		{
			if(str.length()>6 && str.length()<8)
			{
				filteredNames.add(str);
			}
		}
		System.out.println("The filtered names as per the mentioned criteria are : " +filteredNames);*/
		//Using the Streams
		/*filteredNames=namesList.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println("The filtered names as per the criteria are : " +filteredNames);*/
		//namesList.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
		namesList.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);

	}

}
