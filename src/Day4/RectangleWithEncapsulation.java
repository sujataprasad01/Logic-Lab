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
		if (width > 0) {
		this.width = width;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height>0) {
		this.height = height;
		}
	}
	public double area() {
		return width*height;
		
	}
public double perimeter() {
		return 2*(width+height);
	}
}