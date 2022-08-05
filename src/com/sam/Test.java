package com.sam;

public class Test {
	
	public static String trimLeadingZeros(String s) {
		
		for(int i=0; i< s.length(); i++) {
			char c =s.charAt(i);
			if(c!='0') {
				return s.substring(i);
			}
		}
		
		return "0";
	}
	 
	public static void main(String[] args) {
		System.out.println("leading zeros removed======"+trimLeadingZeros("00000010001"));
	}

}
