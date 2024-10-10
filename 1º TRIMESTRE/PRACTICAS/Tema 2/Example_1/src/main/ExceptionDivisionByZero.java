package main;

public class ExceptionDivisionByZero extends Throwable{
	public ExceptionDivisionByZero() {
		super();
	}
	public ExceptionDivisionByZero(String message) {
		super(message);
	}
}
