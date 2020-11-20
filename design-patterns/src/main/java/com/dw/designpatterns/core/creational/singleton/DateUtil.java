package com.dw.designpatterns.core.creational.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
	private static final long serialVersionUID = 9042307841452096782L;
	private static volatile DateUtil instance;

	private DateUtil() {

	}

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}

	protected Object readReolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public static void main(String[] args) {
		DateUtil d1=DateUtil.getInstance();
		DateUtil d2=DateUtil.getInstance();
		System.out.println(d1.hashCode()+" "+d2.hashCode());
		System.out.println(d1==d2);
	}
}
