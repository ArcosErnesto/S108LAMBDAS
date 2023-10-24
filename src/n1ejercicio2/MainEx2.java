package n1ejercicio2;

import java.util.Arrays;
import java.util.List;

public class MainEx2 {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Onomatopeya", "Orca", "Largo", "Azul", "Manzana", "Sol", "Calamar",
				"Luna", "Verde", "Montaña");

		System.out.println("Los strings que contienen 'o' y mas de cinco letras son:");

		strings.stream().filter(string -> string.contains("o") || string.contains("O"))
				.filter(string -> string.length() > 5).forEach(string -> System.out.println(string));
	}
}
