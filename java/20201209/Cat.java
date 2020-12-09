import java.util.*;
public class Cat{
	static final String[] types={"A","B","C"};
	String type;
	String name;
	int intimacy;//フィールドは宣言と同時に初期化される
	public Cat(){
		int character=new Random().nextInt(types.length);
		this.type=types[character];
		System.out.printf("%s-type cat appeared!%n",this.type);
		this.setName();
	}
	public void setName(){
		System.out.print("Please name this cat>");//mainメソッドに記述の方がベター
		this.name=new Scanner(System.in).next();
		System.out.printf("%s jointed!%n",this.name);
	}
	public void catPlay(){
		System.out.printf("Playing with %s%n",this.name);
		System.out.println("...");
		System.out.println("Intimacy is up!!");
		this.intimacy++;
	}
	public String getName(){
		return this.name;
	}
	public int getIntimacy(){
		return this.intimacy;
	}
	public String getType(){
		return this.type;
	}
}
