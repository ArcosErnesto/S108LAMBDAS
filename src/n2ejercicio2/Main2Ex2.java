package n2ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class Main2Ex2 {

	public static void main(String[] args) {
		List<Integer> numsList = List.of(2, 7, 10, 15, 6, 8, 3, 5, 12, 18, 21, 30, 42, 55, 63, 77);

		String output = convertInString(numsList);

		System.out.println(output);

	}

	public static String convertInString(List<Integer> numsList) {
		String output = numsList.stream().map(num -> {
			if (num % 2 == 0) {
				return "e" + num;
			} else {
				return "o" + num;
			}
		}).collect(Collectors.joining(", "));
		return output;
	}
}
