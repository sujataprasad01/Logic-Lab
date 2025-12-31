package Day4;

public class Temperature {

	public static void main(String[] args) {
		TemperatureClass t=new TemperatureClass(25.0);
		System.out.println(t.toFahrenheit());
		TemperatureClass t2=t.withCelsius(30.0);
		System.out.println(t2.toFahrenheit()); 
        System.out.println(t.toFahrenheit()); 
	}

}

class TemperatureClass{
	private final double celsius;
	
	public double toFahrenheit() {
		double ans=0;
		ans=(celsius*(9.0/5))+32;
		return ans;
	}
	public TemperatureClass(double celsius){
		this.celsius=celsius;
	}
	public TemperatureClass withCelsius(double c){
		return new TemperatureClass(c);
	}
}