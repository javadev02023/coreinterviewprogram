package p1;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//find all even numbers from 1 to 100

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
		//even numbers are numbers which can dived by 2
		List<Integer> evenNumberList = IntStream.rangeClosed(1, 100).boxed().filter(i->(i%2==0)).collect(Collectors.toList());
		//even numbers are numbers which can not dived by 2
		List<Integer> oddNumberList = IntStream.rangeClosed(1, 100).boxed().filter(i->(i%2!=0)).collect(Collectors.toList());
		//another way to get odd numbers in list if we have all even numbers list
		List<Integer> oddNumberList2 = IntStream.rangeClosed(1, 100).boxed().filter(i->!evenNumberList.contains(i)).collect(Collectors.toList());
		//prime numbers are the numbers which can be divided by itself or 1
		List<Integer> primeNumberList = IntStream.rangeClosed(1, 100).boxed().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				if (number <= 1) return false;
				//check from 2 to n-1
				for (int i = 2;i < number; i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
				
				return true;
			}
		}).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("evenNumberList"+evenNumberList);
		System.out.println("oddNumberList"+oddNumberList);
		System.out.println("oddNumberList2"+oddNumberList2);
		System.out.println("Prime numbers"+primeNumberList);
	}
	

}
