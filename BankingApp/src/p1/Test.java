package p1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * List<String> names = List.of("Aman", "Bharat", "Arun", "david", "Amit");
 
{a->3,b->1,d->1}
 
 * */
public class Test {

	public static void main(String[] args) {
		List<String> names = List.of("Aman", "Bharat", "Arun", "david", "Amit");
		Map res = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
		System.out.println(res);
	}

}
