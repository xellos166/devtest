package com.dw.designpatterns.core.creational.abstractfactory;

public class Test {
	
	public static void main(String[] args) {
		DaoAbstractFactory produce = DaoFactoryProducer.produce("db");
		Dao dao = produce.createDao("emp");
		dao.save();
	}

}
