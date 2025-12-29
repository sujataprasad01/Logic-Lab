package Day4;

public class Config {

	public static void main(String[] args) {
		
		   System.out.println(ConfigClass.APP_NAME);
	        System.out.println(ConfigClass.VERSION);
	        System.out.println(ConfigClass.MAX_USERS);
	}

}

class ConfigClass{
	public static final String APP_NAME="MyApplication";
	public static final String VERSION="1.0.0";
	public static final int MAX_USERS=100;
	
}
