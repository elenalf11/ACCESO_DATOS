package main;

public class Main {

	public static void main(String[] args) throws ExceptionDivisionByZero, ExceptionNegativeNumber {
		Arithmetic prueba = new Arithmetic(2, 0);
		int z = prueba.division();
		System.out.println(z);

	}

}
