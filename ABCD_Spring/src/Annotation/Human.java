package Annotation;

public class Human {
	
private Heart heart;

public void setHeart(Heart heart) {
	this.heart = heart;
}
public void startPump() {
	if(heart!=null) {
	heart.pump();}
	else {
	System.out.println("Dead");
	}
}
}
