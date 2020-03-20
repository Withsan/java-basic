package test;
/**
 * @author Wyl
 */
public class TestOO {
	public static void main(String[] args)  {
		new Circle();
	}
}

class Draw {
	public Draw(String type) {
		System.out.println(type+" draw constructor");
	}
}

class Shape {
	public Shape(){
		System.out.println("shape constructor");
	}
	private Draw draw = new Draw("shape");
}

class Circle extends Shape {
	public Circle() {
		System.out.println("circle constructor");
	}
	private Draw draw = new Draw("circle");
}