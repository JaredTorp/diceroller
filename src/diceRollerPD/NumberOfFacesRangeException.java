/**
* numberOfDiceRangeException is a class that handles the range exception
*  when the number of faces is zero or less
* 
* @package diceRollerPD
* @author(Jared Torp) 
*/

package diceRollerPD;

public class NumberOfFacesRangeException extends Exception
{
	

	/**
	* this method sends a string message for the exception
	* @param message for the message of the exception
	*/
	 public NumberOfFacesRangeException(String message)
	{
		super(message);
	}
}
