/**
* DiceRollerFrame is a class that creates the frame for the UI
* 
* @package DiceRollerUI
* @author(Jared Torp) 
*/

package diceRollerUI;

import diceRollerPD.DiceBag;
import diceRollerPD.NumberOfDiceRangeException;
import diceRollerPD.NumberOfFacesRangeException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiceRollerPanel extends JPanel
{
	private DiceBag bag; //a Bag object
	private JLabel numFacesLabel, numDiceLabel, totalLabel, errorMessageLabel; //all of the labels
	private JTextField faceField, diceField; //all of the fields
	private JButton button; //for the roll button
	private String errorMessage; //holds an error message
	
	/**
	* constructor for a diceRollerPanel object
	* 
	*/

	public DiceRollerPanel()
	{
		button = new JButton("Roll!");
		button.addActionListener(new ButtonListener());
				
		numFacesLabel = new JLabel("Enter Number of Faces on each die");
		numDiceLabel = new JLabel("Enter Number of Dice");
		faceField = new JTextField(5);
		diceField = new JTextField(5);
		totalLabel = new JLabel("Total Roll: ");
		errorMessageLabel = new JLabel();
		
		add(numFacesLabel); //add all the fields and buttons in order
		add(faceField);
		add(numDiceLabel);
		add(diceField);
		add(button);
		//add the result
		add(totalLabel);
		add(errorMessageLabel);

		setPreferredSize(new Dimension(300,300));
		setBackground(Color.GRAY);
		
		
	}
	
	/**
	* ButtonListener implements ActionListener class and handles the button being pressed
	* 
	* @package DiceRollerUI
	* @author(Jared Torp) 
	*/

	private class ButtonListener implements ActionListener
	{
		
		/**
		* Handles the button being pressed and displays the total roll
		* @param ActionEvent event we pass the event of the button being pressed
		*/
		public void actionPerformed(ActionEvent event)
		{
			int faces, dice;
			
			String diceText = diceField.getText(); //gets the entered text from each
			String faceText = faceField.getText(); 
				
			dice = Integer.parseInt(diceText);
			faces = Integer.parseInt(faceText);
			
			try
			{
				bag = new DiceBag(dice, faces);
			}
			catch (NumberOfFacesRangeException exception)
			{
				errorMessage = exception.getMessage();
				errorMessageLabel.setText(errorMessage); //error here
				totalLabel.setText("Total: Error");
				return;
			}
			catch (NumberOfDiceRangeException exception)
			{
				errorMessage = exception.getMessage();
				errorMessageLabel.setText(errorMessage); //error here
				totalLabel.setText("Total: Error");
				return;
			}
		
			//May have to change this because I need to display EACH face!!!!!!
			totalLabel.setText("Total Roll: " + bag.roll() + " Each Roll " + bag.getRolls()); 
		}
	}
	
}
