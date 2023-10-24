package n1ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainEx6 {

	public static void main(String[] args) {
		List<Object> stringNum = Arrays.asList("Esternocleidomastoideo", 33, "Simpson", "Fender", 4506, -43, "Hola",
				804, "Chiquito", -456);
		List<String> string = new ArrayList<>();

		for (Object obj : stringNum) {
			if (obj instanceof String) {
				string.add((String) obj);
			}
		}

		Collections.sort(string, Comparator.comparingInt(String::length));

		string.forEach(System.out::println);
	}
}
