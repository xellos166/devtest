package com.dw.designpatterns.core.creational.factory;

public class PizzaFactory {
	
	public static Pizza getPizza(String type) {
		Pizza p=null;
		if(type.equals("veggie")) {
			p=new VegPizza();
		}else if(type.equals("chicken")) {
			p=new ChickenPizza();
		}else if(type.equals("pepperoni")) {
			p=new PepperoniPizza();
		}
		return p;
	}

}
