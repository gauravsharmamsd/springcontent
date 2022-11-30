package com.rits;

public   class Magician {
	String magicwords;
	MagicBox box;
	
	public String getMagicwords() {
		return magicwords;
	}

	public void setMagicwords(String magicwords) {
		this.magicwords = magicwords;
	}


//	abstract public MagicBox getBox() ;
//	abstract public MagicBox getBox2() ;

	public void setBox(MagicBox box) {
		this.box = box;
	}
	
	public MagicBox getBox() {
		return this.box ;
	}
	
	/*public String toString() {
		return "Magician [MagicBox=" + box + ", magicwords=" + magicwords
				+ "]";
	}*/

	public void perform(){
		System.out.println(magicwords);
		System.out.println(this);
		System.out.println(getBox().getContents());
		Object o = getBox();
		System.out.println(o);
	}

}
