/**
* Start class is where our Main method is and is the starting point of the program
* 
* @package DiceRollerUI
* @author(Jared Torp) 
*/
package diceRollerUI;

import java.util.Scanner;

import javax.swing.JFrame;

import diceRollerPD.Dice;
import diceRollerPD.DiceBag;
import diceRollerTest.Test;

public class Start 
{
	/**
	 * the main method 
	 * @param args[]
	*/
	public static void main(String[] args)
	{
		//AC#1 rolling a single die
		
		JFrame frame = new DiceRollerFrame();
		frame.pack(); //sets the size
		frame.setVisible(true); //to see the frame
		
		
		
		
		
		
		//ORIGINAL TESTS FOR AC 1 AND 2 HERE
		
		/*Scanner scan = new Scanner (System.in);
	
		System.out.println("Test 1: rolling 1 die");
		System.out.println("How many faces on the dice?");
		int faces = scan.nextInt();
		Dice die = new Dice(faces);
		die.roll();
		System.out.println("You rolled a d" + die.getNumOfFaces() + " and got a " + die.toString());
		*/
		
		//LOOP TO TEST TO SEE IF THE NUMBER IS IN RANGE
		/*for (int i = 0; i < 50; i++) {
			die.roll();
			System.out.println("You rolled a d" + die.getNumOfFaces() + " and got a " + die.toString());
		} */
		
		
		//TEST 2
		/*System.out.println("Test 2: rolling multiple die");
		System.out.println("How many dice does the dice bag have?");
		int numDice = scan.nextInt();
		System.out.println("How many faces are on each die?");
		int numFaces = scan.nextInt();
		
		DiceBag dicebag = new DiceBag(numDice, numFaces);
		dicebag.roll();
		
		System.out.println("The total of all the rolled dice: " + dicebag.toString()); 
		Test test1;
		 test1 = new Test(6); 
		 test1.freqTest();
		*/
		
	}
}
