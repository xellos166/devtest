package com.dw.designpatterns.core.creational.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory{

	@Override
	Dao createDao(String type) {
		Dao dao=null;
		if(type.equals("emp")) {
			dao=new DBEmpDao();
		}else if(type.equals("dept")) {
			dao=new DBDeptDao();
		}
		return dao;
	}

	

}
