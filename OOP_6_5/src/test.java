
public class test {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		
		System.out.println(c1.toString());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
		
		ResizableCircle c2 = new ResizableCircle(10);
		
		System.out.println(c2.toString());
		
		c2.resize(90);
		System.out.println(c2.toString());
	}

}
