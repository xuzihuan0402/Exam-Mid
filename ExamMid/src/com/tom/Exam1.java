package com.tom;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t;
		while(t != -1){
			System.out.print("Please enter number of ticket:");
			t = sc.nextInt();
			if(t == -1);
			break;
			System.out.print("How many round-trip tickets: ");
			int rtrip = sc.nextInt();
			System.out.println("Total tickets: " + t);
			System.out.println("Round-trip: "+rtrip);
			Ticket n = new Ticket(roundTrip);
			
			
		}
		

	}

}
