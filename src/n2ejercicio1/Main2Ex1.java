package n2ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2Ex1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("María", "Juan", "Ana", "Carlos", "Laura", "Pedro", "Ada", "Alejandro",
				"Isabel", "Miguel", "Paula", "Diego", "Adriana", "Eva", "Valentina", "Luis", "Marta", "Gabriel",
				"Elena", "Rafael");

		List<String> filteredNames = filter(names);

		System.out.println(filteredNames);

	}

	public static List<String> filter(List<String> names) {
		List<String> filteredNames = names.stream().filter(name -> name.length() == 3 && name.startsWith("A"))
				.collect(Collectors.toList());
		return filteredNames;
	}

}
