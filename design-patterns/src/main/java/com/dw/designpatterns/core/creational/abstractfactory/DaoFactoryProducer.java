package com.dw.designpatterns.core.creational.abstractfactory;

public class DaoFactoryProducer {
	
	
	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory daoFactory=null;
		if(factoryType.equals("xml")) {
			daoFactory=new XMLDaoFactory();
		}else if(factoryType.equals("db")) {
			daoFactory=new DBDaoFactory();
		}
		return daoFactory;
	}

}
