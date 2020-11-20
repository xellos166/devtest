package com.dw.designpatterns.core.creational.factory;

public class PizzaStore {
	
	
	public Pizza orderPizza(String type) {
		Pizza p=PizzaFactory.getPizza(type);
		p.prepare();
		p.bake();
		p.cut();
		return p;
	}
	
	public static void main(String[] args) {
		PizzaStore store=new PizzaStore();
		store.orderPizza("pepperoni");
	}

}
