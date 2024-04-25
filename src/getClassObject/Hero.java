package getClassObject;

public class Hero {

	static String copyright;
	static {
		System.out.println("初始化copyright");
	    copyright = "版权由Riot Games公司所有";
	}
	String name;
	int hp;
}
