package com.chainsys.miniproject.commonutil;

public class InvalidInputDataException extends Exception{
	public InvalidInputDataException() {
		super("The Input DAta is not valid ");
	}
	public InvalidInputDataException(String message) {
		super(message);
	}
}
