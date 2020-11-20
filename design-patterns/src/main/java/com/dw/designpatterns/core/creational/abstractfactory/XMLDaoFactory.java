package com.dw.designpatterns.core.creational.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{

	@Override
	Dao createDao(String type) {
		Dao dao=null;
		if(type.equals("emp")) {
			dao=new XMLEmpDao();
		}else if(type.equals("dept")) {
			dao=new XMLEmpDao();
		}
		return dao;
	}

	

}
