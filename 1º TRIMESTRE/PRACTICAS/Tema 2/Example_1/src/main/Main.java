package main;

public class Main {

	public static void main(String[] args){
		try {
			Arithmetic prueba = new Arithmetic(-2, 0);
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
		

	}

}
