/**
 * An exception class to throw an exception if a no tree is loaded and session is intended to start  
 * @author 
 * Rezoan Hasib
 * <A HREF="mailto:hasib.rezoan@gmail.com"> (hasib.rezoan@gmail.com) </A>
 */
public class EmptyTreeException extends Exception 
{
	/**
	 * Constructor for the class with the message 
	 */
	public EmptyTreeException(String message)
	{
		super(message); 
	}
}
