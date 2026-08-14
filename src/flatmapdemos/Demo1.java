package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		//map()
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2=list1.stream().map(num->num+10).collect(Collectors.toList());
		System.out.println(list2);
		//Basically map will perform the operation on the single element in the list, and give the output post performing the operation
		
		//flatmap()
		List<Integer> l1=Arrays.asList(1,2);
		List<Integer> l2=Arrays.asList(3,4);
		List<Integer> l3=Arrays.asList(5,6);
		//Now flatmap will be used to combine all these 3 lists into one list
	List<List<Integer>> finalList=Arrays.asList(l1,l2,l3);
	List<Integer> finalResult=finalList.stream().flatMap(num->num.stream().map(n->n+10)).collect(Collectors.toList());
	System.out.println(finalResult);
	//first list l1 will be passed inside the flatmap, processed as stream, and output will be collected inside the list, then l2 will be passed lastly l3 will be passed
	

	}

}
