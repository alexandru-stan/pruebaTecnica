package pruebaTecnica;
import java.util.ArrayList;

public class Clientes {

	String nombre;
	String apellidos;
	String DNI;
	String FechaDeAlta;
	ArrayList<Integer> cuentasBancarias = new ArrayList<Integer>();
	double saldo;
	ArrayList<String> historialMovimientos = new ArrayList<String>();
	public Clientes(String nombre,String apellidos,String DNI,String FechaDeAlta,ArrayList<Integer> cuentasBancarias,double saldo,ArrayList<String> historialMovimientos) {
	
		this.nombre = nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
		this.FechaDeAlta=FechaDeAlta;
		this.cuentasBancarias = cuentasBancarias;
		this.historialMovimientos = historialMovimientos;
		this.saldo=saldo;
		
	
		
	
	}
	
	
	//GETTERS Y SETTERS PARA INFORMAR DE LOS DATOS DEL CLIENTE

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getFechaDeAlta() {
		return FechaDeAlta;
	}

	public void setFechaDeAlta(String fechaDeAlta) {
		FechaDeAlta = fechaDeAlta;
	}


	//ESTE ES EL MÉTODO QUE SE UTILIZARÁ PARA INFORMAR DEL NÚMERO DE CUENTA.

	

	//OTROS MÉTODOS DE LA CLASE
	
	
	//DEPOSITAR DINERO
	
	public ArrayList<Integer> getCuentasBancarias() {
		return cuentasBancarias;
	}


	public void setCuentasBancarias(ArrayList<Integer> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}


	public double getSaldo() {
		return saldo;
	}


	/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


COMENTO ESTE SETTER YA QUE SE VUELVE REDUNDANTE TENIENDO LA FUNCION depositarDinero


*/

	public ArrayList<String> getHistorialMovimientos() {
		return historialMovimientos;
	}


	public void setHistorialMovimientos(ArrayList<String> historialMovimientos) {
		this.historialMovimientos = historialMovimientos;
	}


	public boolean depositarDinero(double cantidad) {
		//METODO ADD PARA SUMAR VALORES BIGDECIMAL
		this.saldo = saldo + cantidad;
		this.historialMovimientos.add("SE HA DEPOSITADO UNA CANTIDAD DE "+cantidad+"€");
		return true;
		
	}
	
	
	public boolean retirarDinero(double cantidad) {
		//MÉTODO SUBTRACT PARA RESTAR VALORES BIGDECIMAL
		this.saldo = saldo-cantidad;
		this.historialMovimientos.add("SE HA RETIRADO UNA CANTIDAD DE "+cantidad+"€");
		return true;
		
	}
	
	
	
	public boolean transaccionBancaria(Clientes cliente,double cantidad) {
		
		this.saldo = saldo - cantidad;
		cliente.depositarDinero(cantidad);
		
		
		
		return true;
	}
	
	
	
	
	

	
	
	
	
}
