
public class Circle implements GeometricObject {
	
	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getPerimeter() {
		return Math.floor(radius*2*Math.PI*100)/100;
	}

	@Override
	public double getArea() {
		return Math.floor(radius*radius*Math.PI*100)/100;
	}

}
