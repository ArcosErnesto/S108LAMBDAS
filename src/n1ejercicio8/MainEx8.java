package n1ejercicio8;

public class MainEx8 {

	public static void main(String[] args) {

		StringReverser string = input -> {
			String reversed = "";
			for (int i = input.length() - 1; i >= 0; i--) {
				char ch = input.charAt(i);
				reversed += ch;
			}
			return reversed;
		};

		String inputString = "La ruta natural";
		String reversedString = string.reverse(inputString);

		System.out.println("String original: " + inputString);
		System.out.println("String invertida: " + reversedString);
	}

}
