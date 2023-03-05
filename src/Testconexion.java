
public class Testconexion {

	public static void main(String[] args) {

		Conexion con = new Conexion();
		try {
			con.leerdatos();

		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo excepcion");
			ex.printStackTrace();
		} finally { /// ejecuta el comando interno sin importar el resultado
			con.Cerrar();
		}

	}

}
