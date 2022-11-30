package com.factory2;

public class ATM {
private Printer ptr;

public Printer getPtr() {
	return ptr;
}

public void setPtr(Printer ptr) {
	this.ptr = ptr;
}
public void bal(int accNo) {
	ptr.x(accNo);
}
}
