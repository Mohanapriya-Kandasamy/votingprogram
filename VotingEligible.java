package org.vote;

import java.util.Scanner;

public class VotingEligible {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	
	System.out.println("Print Your Age:");
	byte age = s.nextByte();
	System.out.println("Age of the person is:"+age);
	
	
	
	if (age>=18) {
		System.out.println("The person is eligible to vote");
		
	}
	else
	{
		System.out.println("The person is not eligible to vote");
	}

}
}