
public class Usuario {


	private int idUsuario;
	private String Nombre;
	private String Apellido;
	private String dni;
	private String correo;
	private String pass;
	private int Descuento;
	private int idRol;
	private int idDomicilio;
	

	
	public Usuario() {
		
	}
	public Usuario(int id, String nombre, String apellido, String dni, String correo, String pass, int esfrecuente,
			int idRol, int idDomicilio) {
		super();
		this.idUsuario = id;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		this.pass = pass;
		this.Descuento = esfrecuente;
		this.idRol = idRol;
		this.idDomicilio = idDomicilio;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDescuento() {
		return Descuento;
	}
	public void setDescuento(int descuento) {
		Descuento = descuento;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
}
