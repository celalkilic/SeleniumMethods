package methods;

import com.gargoylesoftware.htmlunit.javascript.host.css.CSS;

public class Sel_47_CSS_Selector {

	public static void main(String[] args) {
		
		//https://app.hubspot.com/login
		
		// Xpath is slower than Css
		//Xpath allows very prices locators
		//Css allows for selection of elements by their surrounding context
		//Xpath relies on browser's xpath implementation which is not always complete Css
		//Css provides a good balance between structure and attributes
		//CSS does not provide sibling, parents, preceding etc...
		
		
		//  #username
		//  input[id='username'][type='email]
		//  input[type='email']
		
		//Class usage
		// input[class='form-control private-form__control login-email']
		// input.login-email
		
		//Dynamic elements
		// <input id=test_123>
		// <input id=test_345>
		
		
		//http://demo.guru99.com/v1/
		
		//  input[name*='uid'] -- *= contains
		//  label[id^='message'] -- starting with
		//  label[id$='23'] == ending text
		//  td > input[name='uid'] == parent child relationship
		//  td > label[id='message23']

	}

}
