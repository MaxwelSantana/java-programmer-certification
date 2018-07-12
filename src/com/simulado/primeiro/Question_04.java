package com.simulado.primeiro;

class SuperClass {
	SuperClass(int x) {
		System.out.println("Super");
	}
}
	
public class Question_04 extends SuperClass {
	Question_04() {
		// Line n1
		super(10);
		System.out.println("Sub 2");
	}
	
	/*
		Which statement, when inserted at Line n1, enables the code to compile?
		A) this(10);
		B) super(10);
		C) SuperClass(10);
		D) super.SuperClass (10);
		
		Minha resposta		-> B
		Resposta correta	-> B
	*/
}
