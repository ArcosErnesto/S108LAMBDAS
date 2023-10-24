package n1ejercicio3;

import java.util.Arrays;
import java.util.List;

public class MainEx3 {
	public static void main(String[] args) {
		List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");

		months.forEach(month -> System.out.println(month));
	}
}
