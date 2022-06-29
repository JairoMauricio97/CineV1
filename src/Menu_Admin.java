import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu_Admin {

	Scanner t=new Scanner(System.in);
	Conexion conn=new Conexion();
	private String[][] matrizResultado;
	
	public Menu_Admin(Usuario u) throws SQLException {

		System.out.println("Menu Administrador");
		System.out.println("1 Ver listado Salas");
		
		
		int op=t.nextInt();
		
		if(op==1) {			
			String sql="select * from Salas inner join Tipo_Sala using(idTipo_Sala);";
			ResultSet r=conn.devolverConsulta(sql);
			
			System.out.println("idSala| \t Numero|\t Capacidad|\t Tipo");
			
			while(r.next()) {
			
				System.out.println(r.getInt("idSala")+"\t"+r.getString("Numero")+"\t"+
				r.getString("Capacidad")+"\t"+r.getString("tipo"));
			}
		}
	}
}
