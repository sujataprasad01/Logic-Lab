package Day4;

public class IDGenerator {

	public static void main(String[] args) {
		User u1=new User("A");
		User u2=new User("B");
		
		System.out.println(u1.getId());
		System.out.println(u2.getId());
	}

}

class IdgeneratorClass{
	private static int next=1000;
	public static int nextId() {
		return next++;
	}
}

class User{

	private final int id;
	private String name;
	
	public User(String name) {
		this.id=IdgeneratorClass.nextId();
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}