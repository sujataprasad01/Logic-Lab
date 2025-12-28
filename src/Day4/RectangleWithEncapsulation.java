package Day4;

public class RectangleWithEncapsulation {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setWidth(10);
		r.setHeight(5);
		System.out.println(r.area());     
		System.out.println(r.perimeter()); 
		r.setWidth(0); 
	}

}

class Rectangle{
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		return getHeight()*getWidth();
		
	}
public double perimeter() {
		double peri=2*(getHeight()+getWidth());
		return peri;
	}
}