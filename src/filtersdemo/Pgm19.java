package filtersdemo;

import java.util.ArrayList;
import java.util.List;

public class Pgm19 {

	public static void main(String[] args) {
		List<Integer> numbersList=new ArrayList<>();
		numbersList.add(10);
		numbersList.add(35);
		numbersList.add(40);
		numbersList.add(55);
		numbersList.add(90);
		numbersList.add(77);
		numbersList.add(29);
		//90
		numbersList.stream().filter(num->num%2==0).filter(num->num>50).forEach(num->System.out.println(num));
		
		

	}

}
