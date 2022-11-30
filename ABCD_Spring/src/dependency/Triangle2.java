package dependency;

public class Triangle2 {
Point p1;
Point p2;
Point p3;
public Point getP1() {
	return p1;
}
public void setP1(Point p1) {
	this.p1 = p1;
}
public Point getP2() {
	return p2;
}
public void setP2(Point p2) {
	this.p2 = p2;
}
public Point getP3() {
	return p3;
}
public void setP3(Point p3) {
	this.p3 = p3;
}
void draw() {
	System.out.println(getP1().getX()+"   "+getP1().getY() );
	System.out.println(getP2().getX()+"   "+getP2().getY() );
	System.out.println(getP3().getX()+"   "+getP3().getY() );
}
public Triangle2(Point p1, Point p2, Point p3) {
	super();
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;
}

public Triangle2() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Triangle2 [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
}

}
