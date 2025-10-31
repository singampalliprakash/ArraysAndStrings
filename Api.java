package arraysAndStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Api {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5,6);
		int sum=li.stream().reduce(0,(a,b)->(a+b));
		System.out.println(sum);
		List<Integer> result=
				li.stream()
				.map(x->x*2)
				.filter(x->x%3==0)
				.collect(Collectors.toList());
		System.out.println(result);
		li.stream().map(x->(x*2)).filter(x->(x%3==0)).forEach(System.out::println);
//		List<Integer> li1=List.of(1,2,3,4,5,6);
		

	}

}
