package tns.exception;

import java.io.IOException;

public class Throws {
	void display() throws IOException,ArithmeticException{
		throw new ArithmeticException();
	}
}
