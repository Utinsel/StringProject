package three.view;

import javax.swing.JOptionPane;

public class StringView
{
	public void displayRuntimeError()
	{
		int tempNumber;
		String tempString;
		
		JOptionPane.showMessageDialog(null, "Let's crash the program!!!");
		tempString = JOptionPane.showInputDialog("Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "Your favorite number is " + tempNumber);
	}
	
	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null,  "You typed in this earlier: " + currentValue);
	}
	
	public String sendParameterMethod()
	{
		//If you're using a variable in a method you must give it a value first.
		String temp = null;
		
		JOptionPane.showMessageDialog(null, "Let's pass values!!!");
		temp = JOptionPane.showInputDialog("Type in your favorite words");
		
		return temp;
	}
	
	public void moreInteractive(String userName, String funnyPhrase)
	{
		JOptionPane.showMessageDialog(null, "Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, userName + " thinks that " + "\n" + funnyPhrase + " is funny");
	}
	
	public void testStringMethods()
	{
		//You will need to call your methods in here
		testSubstring();
		toUpperCase(null);
		testToString();
		testCompareTo();
	}
	
	private void testSubstring()
	{
		JOptionPane.showMessageDialog(null, "Let's look at a substring" + "\n" + "or the part of a string");
		JOptionPane.showMessageDialog(null, "The string I am using is stored in testString");
		String testString = "supercallifragilisiticexpialidocius";
		JOptionPane.showMessageDialog(null, "It's value is: " + "\n" + testString);
		String temp = testString.substring(7);
		JOptionPane.showMessageDialog(null, "Here it is from the 7th letter on: " + temp);
	}
	//My Uppercase thing
	public String toUpperCase(String stuff)
	{
		JOptionPane.showMessageDialog(null, "Let's look at our all caps project.");
		stuff = JOptionPane.showInputDialog("I will turn what you type into all caps.");
		
		JOptionPane.showMessageDialog(null, "You typed in this: " + stuff.toUpperCase());
		
		return stuff;
		
	}
	//This returns itself
	private void testToString()
	{
			String myToString;

			String myString = "lk;jsadf";
			myToString = myString.toString();
			JOptionPane.showMessageDialog(null, "this string is stupid watch this " + myString);
		}
	//compares words alphabetically
	private void testCompareTo()
	{
		String tools;
		String steve;
		tools = "steve";
		steve = "young";
		int order = tools.compareTo(steve);
		JOptionPane.showMessageDialog(null,  "The value of order is." + order);	
	}
	
	private void testGetBytes()
	{
		byte[] myBytes;
		String myString = "alksdjflkjas";
		myBytes = myString.getBytes();
	}
}
