package Day4;

public class SingletonLogger {

	public static void main(String[] args) {
		Singleton l1=Singleton.getInstance();
		Singleton l2=Singleton.getInstance();
		
		System.out.println(l1==l2);
		
        l1.log("Started");
        l2.log("Running");
}

}

class Singleton{
	private static Singleton instance;
	private Singleton() {
		
	}
	private static final String PREFIX="[APP]";
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	public void log(String msg) {
		System.out.println(PREFIX+msg);
	}
}
