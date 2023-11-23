package com.project.sitefilmes.exception;

public class AuthenticateError extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AuthenticateError(String msg) {
		super(msg);
	}
}
