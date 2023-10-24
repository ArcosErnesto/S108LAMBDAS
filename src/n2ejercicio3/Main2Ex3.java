package n2ejercicio3;

public class Main2Ex3 {

	public static void main(String[] args) {
		Calculator addition = (a, b) -> a + b;
		Calculator subtraction = (a, b) -> a - b;
		Calculator multiplication = (a, b) -> a * b;
		Calculator division = (a, b) -> {
			if (b != 0) {
				return a / b;
			} else {
				System.out.println("No se puede dividir entre zero.");
				return Float.NaN;
			}
		};

		float resAddition = addition.operation(5, 3);
		float resSubtraction = subtraction.operation(5, 3);
		float resMultiplication = multiplication.operation(5, 3);
		float resDivision = division.operation(5, 3);

		System.out.println("Suma: " + resAddition);
		System.out.println("Resta: " + resSubtraction);
		System.out.println("Multiplicación: " + resMultiplication);
		System.out.println("División: " + resDivision);
	}
}
