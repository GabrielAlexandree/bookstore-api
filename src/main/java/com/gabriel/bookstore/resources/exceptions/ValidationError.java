package com.gabriel.bookstore.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandartError {

	private List<FieldMessage> errors = new ArrayList<>();

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addErrors(String fieldName,String message) {
		this.errors.add(new FieldMessage(fieldName,message));
	}

	public ValidationError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidationError(Long timestamp, Integer staus, String error) {
		super(timestamp, staus, error);
		// TODO Auto-generated constructor stub
	}

}
