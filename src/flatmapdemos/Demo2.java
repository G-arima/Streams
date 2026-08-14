package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> teamA=Arrays.asList("Scott","David","John");
		List<String> teamB=Arrays.asList("Mary","Luna","Tom");
		List<String> teamC=Arrays.asList("Ken", "Johny", "Kitty");
		//Method 1
		/*List<List<String>> finalTeam=Arrays.asList(teamA,teamB,teamC);
		List<String> finalResult=finalTeam.stream().flatMap(team->team.stream()).collect(Collectors.toList());
		System.out.println(finalResult);*/
		//Method 2-Before java 8
		List<List<String>> playersInWorldCup=new ArrayList<>();
	playersInWorldCup.add(teamA);
		playersInWorldCup.add(teamB);
		playersInWorldCup.add(teamC);
		/*for(List<String> team:playersInWorldCup)
		{
			for(String name:team)
			{
				System.out.println(name);
			}
		}*/
		//Method 3-After java 8
		
		List<String> teamPlayers=playersInWorldCup.stream().flatMap(team->team.stream()).collect(Collectors.toList());
		System.out.println("The name of the players of the team are : " +teamPlayers);

	}

}
