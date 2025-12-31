package Day4;

import java.util.Vector;
public class Vector2d {

	public static void main(String[] args) {
		VectorTwoD v=VectorTwoD.fromPolar(2, Math.PI/2);
		VectorTwoD w=VectorTwoD.UNIT_X.add(v);
		
	    System.out.printf("%.1f\n", w.getX());
        System.out.printf("%.1f\n",w.getY());
	}

}
class VectorTwoD{
	
	private double x;
	private double y;
	
	public static final VectorTwoD ZERO=new VectorTwoD(0,0);
	public static final VectorTwoD UNIT_X=new VectorTwoD(1,0);
	
	public VectorTwoD(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public static VectorTwoD fromPolar(double r, double theta) {
		double x=r*Math.cos(theta);
		double y=r*Math.sin(theta);
		return new VectorTwoD(x,y);
	}
	public VectorTwoD add(VectorTwoD other) {
		return new VectorTwoD(this.x+other.x, this.y+other.y);
		
	}
	public VectorTwoD scale(double s) {
		return new VectorTwoD(this.x*s, this.y*s);
		
	}
	public double magnitude() {
		return Math.sqrt(x*x+y*y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
}