package dependency;

public class Triangle {
	private String type;
	private int height;
	
public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setType(String type) {
		this.type = type;
	}
public String getType() {
		return type;
	}
public Triangle(String type){
	this.type=type;
}
public Triangle(String type,int height){
	this.type=type;
	this.height=height;
}
    
	

public void draw(){
	System.out.println(getType()+  "Triagle drawn"+  getHeight());
}
@Override
public String toString() {
	return "Triangle [type=" + type + ", height=" + height + "]";
}

}
