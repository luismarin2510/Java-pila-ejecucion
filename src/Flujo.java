
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio do main ");
		metodo1();
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
		}
		System.out.println("Fin del metodo 2");

	}
}
