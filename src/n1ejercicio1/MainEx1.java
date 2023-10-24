package n1ejercicio1;

import java.util.Arrays;
import java.util.List;

public class MainEx1 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Onomatopeya", "Orca", "Largo", "Azul", "Manzana", "Sol", "Calamar",
				"Luna", "Verde", "Montaña");

		System.out.println("Los strings que contienen 'o' son:");

		strings.stream().filter(string -> string.contains("o") || string.contains("O"))
				.forEach(string -> System.out.println(string));

	}

}