import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 *
 */

/**
 * @author Franco
 *
 */
public class Principal {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub

		//Conexion a la base de datos de Postgres
		Database bd = new Database();

		Compania datosEmpresa = null; // Aqui� se guardaran los datos de la clase empresa

//================================Llama a FrameInterfaz==========================================
		FrameInterfaz iPrincipal = new FrameInterfaz(datosEmpresa);
		iPrincipal.setVisible(true);

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String wait;
		wait= bf.readLine();
		System.out.println("hola");

		for(int i=0;i<datosEmpresa.getListaClientes().size();i++){
		System.out.println("\nMuestra en principal!\nNombre1 "+datosEmpresa.getListaClientes().get(i).getNombre1()+
				"\nNombre2 "+datosEmpresa.getListaClientes().get(i).getNombre2()+
				"\nrut "+datosEmpresa.getListaClientes().get(i).getRut()+
				"\nnumero movil "+datosEmpresa.getListaClientes().get(i).getFonoCel());
		System.out.println("Plan: "+datosEmpresa.getListaClientes().get(i).getContratos().get(0).getPlanContratado().getNombrePlan()+"Cuota: "+datosEmpresa.getListaClientes().get(i).getContratos().get(0).getCuotas());
		}
	}
}
