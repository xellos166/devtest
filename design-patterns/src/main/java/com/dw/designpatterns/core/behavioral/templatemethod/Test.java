package com.dw.designpatterns.core.behavioral.templatemethod;

public class Test {
	public static void main(String[] args) {
		DataRendarer rendarer=new XMLDataRendarer();
		rendarer.render();
		
	}
}
