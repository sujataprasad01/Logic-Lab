package Day4;

public class Counter {

	public static void main(String[] args) {
		CounterClass a = new CounterClass();
		CounterClass b = new CounterClass();
		CounterClass c = new CounterClass();
		System.out.println(CounterClass.instances); 
	}

}

class CounterClass{
	private int value=0;
	public static int instances=0;
	
	CounterClass(){
		instances++;
	}
	
	void increment() {
		value++;
	}
void decrement() {
		value--;
	}
int getValue() {
	return value;
}
	
}