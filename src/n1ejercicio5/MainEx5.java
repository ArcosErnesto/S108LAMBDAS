package n1ejercicio5;

public class MainEx5 {

	public static void main(String[] args) {
		PiValue vaule = () -> 3.1415;
		double result = vaule.getPiValue();
		System.out.println(result);

	}
}
