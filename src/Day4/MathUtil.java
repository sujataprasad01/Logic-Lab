package Day4;

public class MathUtil {

	public static void main(String[] args) {
		
		MathUtilClass MathUtil=new MathUtilClass();
		
		System.out.println(MathUtil.max(7, 3));           
		System.out.println(MathUtil.clamp(15, 0, 10));   
		System.out.println(MathUtil.clamp(-3, -2, 5));
	}

}

class MathUtilClass{
	public static int max(int a, int b) {
		int largest=Integer.MIN_VALUE;
			if(a>b) {
				largest=a;
			}else {
				largest=b;
			}
		return largest;
	}
	public static int clamp(int v, int min, int max) {
		int clamped;
		clamped=Math.max(min, Math.min(max, v));
		return clamped;
	}
}
