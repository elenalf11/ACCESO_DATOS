package main;

public class Operacion {

	public int suma(int a, int b) throws ExceptionNumberSeven{
		if(b == 7 || a == 7) {
			throw new ExceptionNumberSeven();
		}
		
		return a + b;
	}

}
