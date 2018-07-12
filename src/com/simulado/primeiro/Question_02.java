package com.simulado.primeiro;

public class Question_02 {

	public static void main(String[] args) {
		int cardVal = 18;
		switch (cardVal) {
			 case 4: case 5: case 6:
			 case 7: case 8:
			 System.out.println("Hit");
			 break;
			 case 9: case 10: case 11:
			 System.out.println("Double");
			 break;
			 case 15: case 16:
			 System.out.println("Surrender");
			 break;
			 default:
			 System.out.println("Stand");
		}
	}
	
	/*
		Which two code fragments can be inserted at Line n1, independently, enable to print Stand?
		A) int cardVal = 6;
		B) int cardVal = 10;
		C) int cardVal = 14;
		D) int cardVal = 18;
		
		Minha resposta		-> C and D
		Resposta correta	-> C and D
	*/

}
