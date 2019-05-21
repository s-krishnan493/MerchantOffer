package codescreen.custom.exceptions;

/**
 * The OfferNotFoundException wraps all checked standard Java exception and enriches them with a custom error code.
 * 
 * @author Suresh
 */
public class OfferNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;

	public OfferNotFoundException(String message, Throwable cause, String code) {
		super(message, cause);
		this.code = code;
	}
	
	public OfferNotFoundException(String message, String code) {
		super(message);
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
	}

}
