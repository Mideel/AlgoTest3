package com.mitrais.algo.main;

import java.util.Arrays;

public class RerversingSomeArrayElements {
	
	public static void main(String[] args) {
		int[] input = new int[] {5,9,0,4,0,7,0,1,0};
		System.out.println("Original: " + Arrays.toString(input));
		reverseArray(input);
		System.out.println("Modified: " + Arrays.toString(input));
	}
	
	public static void reverseArray(int[] _arg) {
		if(_arg == null)
			return ;
		
		boolean reverse = false;
		int elementLeft = _arg.length;
		int leftPointer = 0;
		int rightPointer = elementLeft - 1 ;
		
		while(elementLeft-- > 0) {
			if(!reverse) {
				if(_arg[leftPointer++] > 0)
					reverse = true;
			}
			else {
				if(_arg[rightPointer--] > 0) {
					int temp = _arg[leftPointer - 1] ;
					_arg[leftPointer - 1] = _arg[rightPointer + 1];
					_arg[rightPointer + 1] = temp;
					reverse = false;
				}
			}
		}
		
	}

}
