
/**
* DiceBag is a Class that represents a collection of Die 
* that have the same number of faces.
* 
* @package DiceRollerPD
* @author(Jared Torp) 
*/

package diceRollerPD;


public class DiceBag 
{
	private int numOfFaces;
	private int numOfDice;
	private int total;
	private Dice dice[];
	private String rolls;
/**
* Instantiates a DiceBag with the specified number 
* of Dice with a specific number of faces.  
*
* @param  numOfFaces  for the number of faces on the dice in the bag
* @param  numOfDice  for the number of dice in the bag
* @throws NumberOfDiceRangeException - if the number of dice is not greater than 0
* @throws NumberOfFacesRangeException - propagates from Dice
*/
	public DiceBag(int numOfDice, int numOfFaces) throws 
	NumberOfDiceRangeException, NumberOfFacesRangeException
	{
		if (numOfDice < 0)
		{
			NumberOfDiceRangeException exception =
					new NumberOfDiceRangeException("Number of Dice must be greater than -1");
					throw exception;
		}
		else if (numOfFaces <= 0)
		{
			NumberOfFacesRangeException exception =
					new NumberOfFacesRangeException("Number of Faces must be greater than zero");
					throw exception;
		}
		else
		{
			this.numOfDice = numOfDice; //set the number of dice
			this.numOfFaces = numOfFaces; //set the faces
			dice = new Dice[numOfDice]; //allocate the array
			
			//Construct each of the dice
			for(int i = 0; i < numOfDice; i++)
			{
				dice[i] = new Dice(numOfFaces); //do I have to catch this? how would I do this cleanly?
			} 
			
			rolls = "";
		}
	
		
		
	}
	
	
	
/**
* rolls the number of dice and calculates the total
* @return the total of all the dice rolled
*/
	public int roll()
	{
		
		total = 0; //set our total to 0 and add in the for loop
		for(int i = 0; i < numOfDice; i++)
		{
			dice[i].roll();
			rolls = rolls + dice[i].toString() + " "; //print the faces that were rolled
			total = total + dice[i].getCurrentFace();
		}
		
		return total;
	}
	
	
	
/**
* returns the string of all the rolls
* @return the string of rolls
*/
	public String getRolls()
	{
		return rolls;
	}

	/**
	* Creates a string of the total roll
	* @return The string of the total roll
	*/
	public String toString()
	{
		//I think that they want this to be the total
		String result = Integer.toString(total);
		return result;
	}
	
	
	
	
}
