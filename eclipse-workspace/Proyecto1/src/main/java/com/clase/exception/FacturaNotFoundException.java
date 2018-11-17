package com.clase.exception;

public class FacturaNotFoundException extends Exception {

	
	private static final long serialVersionUID = 2;

	public FacturaNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public FacturaNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FacturaNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public FacturaNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
