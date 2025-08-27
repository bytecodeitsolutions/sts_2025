package itm.streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class OurConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
		
	}
	
}
public class EvenOddWithJava8 {
    public static void main(String[] args) {
    	
    	
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.println(n));
        

        System.out.println("\nOdd numbers:");T
        numbers.stream()
               .filter(n -> n % 2 != 0)
               .forEach(n -> System.out.println(n));
    }
}
