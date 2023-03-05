
public class Testconexion {

	public static void main(String[] args) throws Exception {

		/*
		 * Conexion con = new Conexion();
		 * 
		 * try { con.leerdatos(); } catch (IllegalStateException ex) {
		 * System.out.println("Recibiendo excepcion"); ex.printStackTrace(); } finally {
		 * /// ejecuta el comando interno sin importar el resultado con.Cerrar(); }
		 */
		/*
		 * Conexion con = null; try { con = new Conexion(); con.leerdatos(); } finally {
		 * System.out.println("ejecutanto finaly"); if (con != null) { con = new
		 * Conexion(); }
		 * 
		 * }
		 */
		try (Conexion con = new Conexion()) {
			con.leerdatos();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo excepcion");
			ex.printStackTrace();
		}

	}

}
