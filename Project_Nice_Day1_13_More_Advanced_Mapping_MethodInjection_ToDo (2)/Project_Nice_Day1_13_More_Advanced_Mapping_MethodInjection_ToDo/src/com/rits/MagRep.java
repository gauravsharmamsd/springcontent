package com.rits;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MagRep implements MethodReplacer {
	String magicwords;
	MagicBox box;

	public String getMagicwords() {
		return magicwords;
	}

	public void setMagicwords(String magicwords) {
		this.magicwords = magicwords;
	}

	public MagicBox getBox() {
		return box;
	}

	public void setBox(MagicBox box) {
		this.box = box;
	}

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
	//	System.out.println(magicwords);
		System.out.println(box);
		return "magicwords";
	}

}
