package dependency;

public class Point {
SubPoint sp;
public SubPoint getSp() {
	return sp;
}
public void setSp(SubPoint sp) {
	this.sp = sp;
}
public SubPoint getS() {
	return sp;
}
int x;
int y;

public Point() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Point [s=" + sp + ", x=" + x + ", y=" + y + "]";
}
public Point(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public Point(SubPoint s) {

	this.sp = s;
	
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
}
