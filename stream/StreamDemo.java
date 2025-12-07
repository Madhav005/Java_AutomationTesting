package stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3, 6, 9, 1, 34, 5, 7, 12);
		
		list.stream()
		.filter(x -> x%2==0)
		.forEach(x->System.out.print(x + " "));
		System.out.println("\n****************");
		
		list.stream()
		.map(num->num*num)
		.forEach(num->System.out.print(num+" "));
		System.out.println("\n****************");
		
		int sumoflist = list.stream()
		.reduce(0,(n1,n2)->n1+n2);
		System.out.println(sumoflist);
		System.out.println("***************");
		
		list.stream()
		.sorted()
		.forEach(num->System.out.print(num+" "));
	}

}
