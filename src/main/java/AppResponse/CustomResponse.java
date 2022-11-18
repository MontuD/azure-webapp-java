package AppResponse;

public class CustomResponse<T> {
	int responseCode;
	T message;
	
	public CustomResponse() {
		// TODO Auto-generated constructor stub
	}
	


	public CustomResponse(T message, int responseCode) {
		super();
		
		this.message = message;
		this.responseCode = responseCode;
	}


	public T getMessage() {
		return message;
	}



	public void setMessage(T message) {
		this.message = message;
	}



	public int getResponseCode() {
		return responseCode;
	}



	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	
	
	
	
	
	
	
	
	

}
