package Day4;

public class LibraryBook {

	public static void main(String[] args) {
		Library b=new Library("1984", "Orwell");
		b.issue();
		b.issue();
		b.returnBook();
	}

}

class Library{
	private String title;
	private String author;
	private boolean issued=false;
	
	public static int totalBooks=0;
	
	public Library(String title, String author){
		this.title=title;
		this.author=author;
		this.totalBooks++;
	}
	
	public void issue() {
		if(!issued) {
			issued=true;
			System.out.println("Issued successfully");
		}else {
			System.out.println("Already Issued");
		}
	}
	public void returnBook() {
		if(issued) {
			issued=false;
			System.out.println("Returned successfully");
		}else {
			System.out.println("Book was not issued");
		}
	}
	public boolean isIssued() {
		return issued;
	}
}
