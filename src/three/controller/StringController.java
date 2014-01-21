package three.controller;

import three.view.StringView;

/**
 * StringController for the third Java Project
 * @author bech2002
 *
 */

public class StringController
{
	private StringView myView;
	
	/**
	 * Creates a StringController object, initializing all values as needed.
	 */
	public StringController()
	{
		myView = new StringView();
	}
	
	/**
	 * Starts the code starting with the displayRuntimeError method.
	 */
	public void start()
	{
//		//myView.displayRuntimeError();
//		String temp = myView.sendParameterMethod();
//		myView.usePassedValue(temp);
//		
////		myView.usePassedValue(myView.sendParameterMethod());
//		
//		myView.moreInteractive("Berry", myView.sendParameterMethod());	
//		myView.testStringMethods();
		myView.toUpperCase(null);
	}
	
}
