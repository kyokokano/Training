import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("建物の幅>");
		int width = sc.nextInt();
		Building b = new Building(width);
		b.display();
		List<String> buils = new ArrayList<>();
		buils.add(b);
	}
}
