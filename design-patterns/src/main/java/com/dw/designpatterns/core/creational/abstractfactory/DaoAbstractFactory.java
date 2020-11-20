package com.dw.designpatterns.core.creational.abstractfactory;

public abstract class DaoAbstractFactory {
  abstract Dao createDao(String type);
}
