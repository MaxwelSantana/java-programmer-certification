package com.simulado.primeiro;

import java.util.ArrayList;
import java.util.List;

public class Question_05 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Pen");
		items.add("Pencil");
		items.add("Box");
		for(String i:items) {
			if(i.indexOf("P") == 0) {
				continue;
			} else {
				System.out.println(i+" ");
			}
		}
	}
	
	/*
		What is the result?
		A) Pen Pencil Box
		B) Pen Pencil
		C) Box
		D) Compilation fails.
		
		Minha resposta		-> B
		Resposta correta	-> C

	*/

}
