package dependency;

public class SubPoint {
int l;

public void setL(int l) {
	this.l = l;
}
public SubPoint() {
	super();
	// TODO Auto-generated constructor stub
}
public SubPoint(int l) {
	this.l=l;
}

@Override
public String toString() {
	return "SubPoint [l=" + l + "]";
}

public int getL() {
	return l;
}
}
