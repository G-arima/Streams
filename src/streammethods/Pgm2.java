package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pgm2 {

	public static void main(String[] args) 
	{
	List<Integer> numbersList=Arrays.asList(1,2,3,4,5,6,7,8);
	//Count Method
	long countEvenNumbersFromList=numbersList.stream().filter(num->num%2==0).count();
	System.out.println(countEvenNumbersFromList);
	//Minimum Method
	Optional<Integer> min=numbersList.stream().min((val1,val2)->{return val1.compareTo(val2);});
	System.out.println(min.get());
	//Maximum Method
	Optional<Integer> max=numbersList.stream().max((val1,val2)->{return val1.compareTo(val2);});
	System.out.println(max.get());
	
	//Maximum Method
	
	}

}
