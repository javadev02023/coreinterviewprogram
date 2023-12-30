package p1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortListPartially {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(8);
		numbers.add(5);
		numbers.add(7);
		numbers.add(4);
		numbers.add(6);
		numbers.add(9);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		List<Integer> finalList = Stream.concat(numbers.stream().limit(5).sorted(), numbers.parallelStream().skip(5)).collect(Collectors.toList());
		System.out.println("orignal :"+numbers);
		System.out.println("finalList :"+finalList);

	}

}
