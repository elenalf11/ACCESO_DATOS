package main;

public class Main {

	public static void main(String[] args){
		Arithmetic prueba = new Arithmetic(-2, 3);
		try {
			int z = prueba.division();
			System.out.println(z);
		}
		catch(ExceptionDivisionByZero e) {
			System.out.println(e.getMessage());
		}
		catch(ExceptionNegativeNumber e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("La ejecucion ha acabado");
		}
		System.out.println("El programa ha acabado");
		

	}

}
