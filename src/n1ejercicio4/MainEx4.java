package n1ejercicio4;

import java.util.Arrays;
import java.util.List;

public class MainEx4 {

	public static void main(String[] args) {
		List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");

		months.forEach(System.out::println);

	}
}
