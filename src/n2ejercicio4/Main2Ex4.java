package n2ejercicio4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2Ex4 {

	public static void main(String[] args) {
		List<Object> list = Arrays.asList("Calatrava", 33, "Ensaladilla", 87, "Alfeizar", 648, "Torrezno", 78,
				"Txapela", 6);

		System.out.println("Lista original:");
		list.forEach(item -> System.out.println(item));

		list.sort((o1, o2) -> {
			char firstChar1 = o1.toString().charAt(0);
			char firstChar2 = o2.toString().charAt(0);
			return Character.compare(firstChar1, firstChar2);
		});

		System.out.println("\nLista ordenada alfabéticamente por el primer carácter:");
		list.forEach(item -> System.out.println(item));

		list.sort((o1, o2) -> {
			boolean hasE1 = o1.toString().contains("e") || o1.toString().contains("E");
			boolean hasE2 = o2.toString().contains("e") || o2.toString().contains("E");

			if (hasE1 && !hasE2) {
				return -1;
			} else if (!hasE1 && hasE2) {
				return 1;
			} else {
				return 0;
			}
		});

		System.out.println("\nLista ordenada con cadenas que contienen 'e' primero:");
		list.forEach(item -> System.out.println(item));

		list = list.stream().map(item -> item instanceof String ? ((String) item).replace("a", "4") : item)
				.collect(Collectors.toList());

		System.out.println("\nLista con 'a' reemplazada por '4':");
		list.forEach(item -> System.out.println(item));

		List<Object> numericElements = list.stream()
				.filter(item -> item instanceof Integer || (item instanceof String && isNumeric((String) item)))
				.collect(Collectors.toList());

		System.out.println("\nElementos numéricos:");
		numericElements.forEach(item -> System.out.println(item));
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
