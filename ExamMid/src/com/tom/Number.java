package com.tom;

import java.util.Random;

public class Number {
	int secret;
	public Number(){
		Random random = new Random();
		secret = random.nextInt(10) + 1 ;
		System.out.println(secret);
	}
	
	public int guess(int number){
		return secret - number;
	}

}
