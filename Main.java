package pruebaTecnica;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	
	public static void main(String[]args) {
		
		
		Clientes cliente1 = new Clientes("Alexandru","Stan","3456543B","03/06/2020",new ArrayList<Integer>(Arrays.asList(235430503,35324333)),  300.4,new ArrayList<String>());
		Clientes cliente2 = new Clientes("Luis","Gonzalez","356643543","12/04/2012",new ArrayList<Integer>(Arrays.asList(2345635,2354645)), 2000.34,new ArrayList<String>());
		
	
		//AQUI HAGO UNAS SIMPLES OPERACIONES DE DEPÓSITO / RETIRO
		
		System.out.println("EL SALDO ACTUAL DEL CLENTE ES DE "+cliente1.saldo);
		
		if(cliente1.depositarDinero(25)) {
			System.out.println("OPERACIÓN REALIZADA, SE MOSTRARÁ EL HISTORIAL DE MOVIMIENTOS");
		}
		
		if(cliente1.retirarDinero(200)) {
			System.out.println("OPERACIÓN REALIZADA, SE MOSTRARÁ EL HISTORIAL DE MOVIMIENTOS");
		}
		
		System.out.println(cliente1.getHistorialMovimientos());
		
		System.out.println("EL SALDO ACTUAL ES DE "+cliente1.getSaldo());
		
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		
		
		//AQUI HAGO UNA TRANSACCIÓN ENTRE CLIENTE1 Y CLIENTE2
		
		System.out.println("SALDO DE CLIENTE1 ANTES DE LA TRANSACCIÓN  "+cliente1.getSaldo());
		System.out.println("SALDO DE CLIENTE 2 ANTES DE LA TRANSACCION  "+cliente2.getSaldo());		
		
		if(cliente1.transaccionBancaria(cliente2, 30)) {
			System.out.println("SALDO DE CLIENTE1 DESPUÉS DE LA TRANSACCIÓN  "+cliente1.getSaldo());
			System.out.println("SALDO DE CLIENTE 2 DESPUÉS DE LA TRANSACCION  "+cliente2.getSaldo());		
			
		}
		
		
		
		//POR ÚLTIMO, MUESTRO EL HISTORIAL DE TRANSACCIONES DE AMBOS CLIENTES
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println(cliente1.getHistorialMovimientos());
		System.out.println(cliente2.getHistorialMovimientos());
		
		
		
		
		
	}
	
	
	
}
