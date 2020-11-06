/**
* Test is a Class that helps the programmer test to see if the functions of the 
* DiceBag and Dice are working correctly
* @package DiceRollerTest
* @author(Jared Torp) 
*/

package diceRollerTest;

import diceRollerPD.Dice;
import diceRollerPD.DiceBag;
import diceRollerPD.NumberOfDiceRangeException;
import diceRollerPD.NumberOfFacesRangeException;


public class Test {
	
	private Dice testDie; //our dice object
	private DiceBag testBag; //our bag object
	private int arrCount[]; //the array that will help our frequency test
	

/**
* Instantiates a Test with a specific number of faces.  
*
* @param  numOfFaces  for the number of faces on the dice in the bag
* @throws NumberOfFacesRangeException - propagates from Dice
*/
	public Test(int numOfFaces) throws NumberOfFacesRangeException
	{
		if (numOfFaces <=0)
		{
			NumberOfFacesRangeException exception =
					new NumberOfFacesRangeException("Number of Faces must be greater thatn zero");
					throw exception;
		}
		else
		{
			testDie = new Dice(numOfFaces);  //create a Die object
			arrCount = new int[numOfFaces + 1]; //Create an array of number of faces + 1 elements to count the results
			
			for(int i = 0; i < numOfFaces; i++) 
			{
				arrCount[i] = 0; //fill the array with zeros to count the results
			}
		}
	
		
	}

	
	public Test(int numOfFaces, int numOfDice) 
			throws NumberOfDiceRangeException, NumberOfFacesRangeException
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
					new NumberOfFacesRangeException("Number of Faces must be greater thatn zero");
					throw exception;
		}
		else
		{
			testBag = new DiceBag(numOfDice, numOfFaces);	
		}
	
		
	}
	

	/**
	 * this method tests the frequency of a SINGLE die 100 times
	*/
	
	public void freqTest()
	{
		
		//loop to roll 100 times
		for(int i = 0; i < 100; i++)
		{
			testDie.roll();
			//System.out.print(testDie.toString() + " "); //print the faces that were rolled
			arrCount[testDie.getCurrentFace()] += 1;
		}
		
		//loop to print the results
		for (int i = 1; i < testDie.getNumOfFaces() + 1; i++)
		{
			System.out.println("Frequency of Face " + i + ": " + (arrCount[i]));
		}
		
		
		
	}
	
	

}
