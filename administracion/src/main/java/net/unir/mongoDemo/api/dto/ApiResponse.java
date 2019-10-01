package net.unir.mongoDemo.api.dto;

public class ApiResponse {

	private String status;
	private String message;

	private Object objeto;

	public ApiResponse(String status, Object objeto) {
		this.status = status;
		this.objeto = objeto;
	}

	public ApiResponse(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
