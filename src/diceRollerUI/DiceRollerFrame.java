/**
* DiceRollerFrame is a class that creates the frame for the UI
* 
* @package DiceRollerUI
* @author(Jared Torp) 
*/

package diceRollerUI;

import javax.swing.JFrame;

public class DiceRollerFrame extends JFrame
{
	
	/**
	* instantates a frame and sets the default close operation
	*/

	public DiceRollerFrame()
	{
		setTitle("Dice Roller");
		DiceRollerPanel panel = new DiceRollerPanel();
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //identify when the close
	}
	
	
	
	
	
	
	
	//DiceRollerPanel panel = new DiceRollerPanel();
	//frame.getContentPane().add(panel);

}
