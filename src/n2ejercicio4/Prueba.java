package n2ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		List<Object> list = Arrays.asList("Calatrava", 33, "Ensaladilla", 87, "Alfeizar", 648, "Torrezno", 78,
				"Txapela", 6);

		System.out.println("Lista original:");
		list.forEach(item -> System.out.println(item));

	}

}
