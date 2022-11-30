
public abstract class Magician {
	abstract Box getBox();
}

class ElephantBox implements Box{
	public String showContent() {
		return "I'm a Big Indian Elephant";
	}
}
class BirdBox implements Box{
	public String showContent() {
		return "I'm a BIRD";
	}
}
interface Box {
	String showContent();
}
