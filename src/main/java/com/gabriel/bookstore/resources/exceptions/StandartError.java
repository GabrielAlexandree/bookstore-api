package com.gabriel.bookstore.resources.exceptions;

public class StandartError {

	private Long timestamp;

	private Integer staus;
	
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStaus() {
		return staus;
	}

	public void setStaus(Integer staus) {
		this.staus = staus;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	private String error;

	public StandartError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandartError(Long timestamp, Integer staus, String error) {
		super();
		this.timestamp = timestamp;
		this.staus = staus;
		this.error = error;
	}
	
}
