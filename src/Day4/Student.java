package Day4;

public class Student {

	public static void main(String[] args) {
		StudentReadOnly s=new StudentReadOnly();
		s.setName("Alice");
		System.out.println(s.getId());
//		s.id;
	}

}

class StudentReadOnly{
	final int id;
	private String name;
	
	public int getId() {
		return id;
	}
	StudentReadOnly(){
		id=101;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
