
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio do main ");
		metodo1();
		metodo3();
		System.out.println("fin del main");
	}

	private static void metodo1() {
		System.out.println("Inicio del metodo 1");
		metodo2();
		System.out.println("fin del metodo 1");
	}

	private static void metodo2() {
		System.out.println("inicio del metodo 2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				int num = 0;
				int resultado = i / num;
				System.out.println(resultado);
				String test = null;
				System.out.println(test.toString());

			} catch (ArithmeticException | NullPointerException exception) {
				System.out.println("Atrapo excepcion ");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
		}
		System.out.println("Fin del metodo 2");

	}

	private static void metodo3() {
		System.out.println("Inicio metodo 3");
		throw new excepciones("MI excepcion fue lanzada ");

	}
}
