package com.mitrais.algo.main;

public class OutputStar {
	
	public static void main(String[] args) {
		outputStars(5);
	}
	
	public static void outputStars(int _number) {
		if(_number < 1)
			return;
		
		int halfLength = (int) (_number / 2.0);
		if(halfLength == 0)
			halfLength = 1;
		
		for(int i = 1 ; i <= _number ; i++) {
			int halfStarLength = i / 2;
			int spaceAmount = halfLength - halfStarLength; 
			for(int i2 = 1 ; i2 <= spaceAmount ; i2++) {
				System.out.print(" ");
			}
			for(int i2 = 1 ; i2 <= i ; i2++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
}
