/*Write a Java program to 
get temperature input from the user and convert from Fahrenheit to Celsius, 
store the data using preferred 
collection and display the result on the console?
*/


package com.bench.assignment;

import java.util.Scanner;

/*
 * Logic of Fahrenheit to Celsius.
 * */
class ActionMethod{
	private float celcius = 0;
	protected void farenheitToCelsius(float farenheit ) {
		celcius = (farenheit -32)*5/9;
		System.out.println("Temperature in celsius is "+celcius+ "\u00B0"+"C");
	}
}

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		// taking input the from user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the tempreture in Farenheit: ");
		float farenheit = scan.nextFloat();
		scan.close();
		System.out.println();
//		Create object of the ActionMethod class.
		ActionMethod action = new ActionMethod();
		action.farenheitToCelsius(farenheit);
	}

}
