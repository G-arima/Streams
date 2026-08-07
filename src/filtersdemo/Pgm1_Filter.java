package filtersdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pgm1_Filter {

	public static void main(String[] args) {
		/*ArrayList<Integer> numbersList=new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(20);
		numbersList.add(25);
		numbersList.add(30);
		numbersList.add(35);*/
		
		List<Integer> numbersList=Arrays.asList(10,15,20,25,30,35);
		//Requirement is to filter only the even numbers and put those numbers into another collection.
		List<Integer> evenNumbersList=new ArrayList<Integer>();
		//Method 1 : Using enhanced for loop we will put the values in the evenNumbersList collection
		/*for(int n:numbersList)
		{
			if(n%2==0)
			{
				evenNumbersList.add(n);
			}
				}
		System.out.println("The even numbers are : " +evenNumbersList);*/
		
		//Above method was without using streams concept
		
		//Method 2 - With Streams
		//Step 1 : Add the collection into the Stream, then methods like filter, sorted, count, distinct will be used
		//evenNumbersList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		//First of all numbersList collection need to be converted into the stream, then filtering will happen, then at the end collect the data in the form of a list and put it another collection
		//System.out.println(evenNumbersList);
		//numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
		
		
		
		
		
		

	}

}
