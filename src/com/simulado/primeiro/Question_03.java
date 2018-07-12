package com.simulado.primeiro;

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

public class Question_03 extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}
		 
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Writer w = new Question_03();
		w.write();
	}
	
	/*
		What is the result?
		A) Writing...
		B) Writing book
		C) Writing code
		D) Compilation fails.
		
		Minha resposta		-> C
		Resposta correta	-> A
	*/
}


