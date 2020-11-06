/**
* Dice is a Class that represents a single die with a number of faces
* 
* @package DiceRollerPD
* @author(Jared Torp) 
*/

package diceRollerPD;

import java.util.Random;

/**
 * @author jared
 *
 */

public class Dice
{
	private int numOfFaces; //holds the number of faces
	private int currentFace; //holds the current face
	private Random randomGen; //holds a random generation 
	
	/**
	* Instantiates a Dice with a specific number of faces.  
	*
	* @param  numOfFaces  for the number of faces of a single die
	* @throws NumberOfFacesRangeException - faces cannot be less than zero
	*/

	public Dice(int numOfFaces) throws 
	NumberOfFacesRangeException //checks to see if the faces are in range
	{
		if (numOfFaces <=0)
		{
			NumberOfFacesRangeException exception =
					new NumberOfFacesRangeException("Number of Faces must be greater than zero");
					throw exception;
		}
		else
		{
			this.numOfFaces = numOfFaces;
		}
	
	}
	
	
	/**
	* Gets a random generation from the random class
	* @return Random a seed for the random class
	*/
	public Random getRandomGen()
	{
		//confused by this function
		Random gen = new Random();
		this.randomGen = gen;
		return gen; //I think I have to change this function
	}
	/**
	* a getter to get the number of faces
	* @return int for the total number of faces
	*/
	public int getNumOfFaces()
	{
		return numOfFaces;
	}
	
	/**
	 * Setter that sets the number of faces
	 * @param numOfFaces for the number of faces we want the die to have
	 * @throws NumberOfFacesRangeException Will throw an exception if it s out of range
	*/
	public void setNumOfFaces(int numOfFaces) throws 
	NumberOfFacesRangeException
	{
		if (numOfFaces <=0)
		{
			NumberOfFacesRangeException exception =
					new NumberOfFacesRangeException("Number of Faces must be greater thatn zero");
					throw exception;
		}
		else
		{
			this.numOfFaces = numOfFaces;
		}
	
	}
	
	/**
	* getter for the current face
	* @return currentface
	*/
	public int getCurrentFace()
	{
		return currentFace;
	}
	
	/**
	* Setter to set the current face
	* @param currentFace pass the integer of the current face
	*/
	public void setCurrentFace(int currentFace)
	{
		this.currentFace = currentFace;
	}
	
	/**
	* Setter to set the RandomGen
	* @param randomGen pass the Random object 
	*/
	public void setRandomGen(Random randomGen) {
		this.randomGen = randomGen;
	}


	/**
	* Function to roll a single die
	* @return num for the number we get when we roll
	*/
	public int roll()
	{
		int num = getRandomGen().nextInt(numOfFaces) + 1;
		this.currentFace = num;
		return num;
		
	}
	
	/**
	* A toString function so we can view the result as a string
	* @return String result  returns a string
	*/
	public String toString()
	{
		String result = Integer.toString(currentFace);
		return result;
		
	}
	
	
	
	
	
	
	
}
