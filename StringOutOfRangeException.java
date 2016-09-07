/**
 * An exception class to throw an exception if label or prompt or message has more than 60 characters  
 * @author 
 * Rezoan Hasib
 * <A HREF="mailto:hasib.rezoan@gmail.com"> (hasib.rezoan@gmail.com) </A>
 */
public class StringOutOfRangeException extends Exception {
	/**
	 * constructor to catch the exception 
	 * @param message
	 */
	public StringOutOfRangeException(String message)
	{
		super(message); 
	}

}
