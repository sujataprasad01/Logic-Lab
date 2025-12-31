package Day4;

public class AccessDemo {

	public static void main(String[] args) {
		AccessDemoClass ad=new AccessDemoClass();
		ad.b();
		ad.c();
		ad.d();
//		ad.a(); cannot called
	}

}

class AccessDemoClass{
	private void a() {
		System.out.println("From Private");
	}
	protected void b() {
		System.out.println("From Protected");
	}
	void c() {
		System.out.println("From Default");
	}
	public void d() {
		System.out.println("From Public");
	}
}