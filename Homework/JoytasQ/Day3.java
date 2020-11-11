/*
//Javaの学習を始めて３日くらいの人のための問題集
//Q1
public class Day3{
	public static void main(String[] args){
		int x = 23;
		int y = 6;
		System.out.printf("x + y = %d%n",x + y);
		System.out.printf("x - y = %d%n",x - y);
		System.out.printf("x * y = %d%n",x * y);
		System.out.printf("x / y = %d%n",x / y);
		System.out.printf("x %% y = %d%n",x % y);
	}
}
//Q2
public class Day3{
	public static void main(String[] args){
		int x = 10;
		int count = 3;
		while(count > 0){
			count--;
			x += 5;
		}
		System.out.printf("Ans:%d%n",x);
	}
}
//Q3
public class Day3{
	public static void main(String[] args){
		int r =new java.util.Random().nextInt(10)+1;
		if(r % 2 == 0){
			System.out.printf("%dは偶数(even)%n",r);
		}else{
			System.out.printf("%dは奇数(odd)%n",r);
		}
	}
}
//Q4
public class Day3{
	public static void main(String[] args){
		double bottom = 4.3;
		double height = 5.4;
	System.out.printf("底辺:%.1f,高さ:%.1fの三角形の面積は:%.2f%n",bottom,height,bottom * height / 2);
	}
}
//Q5
public class Day3{
	public static void main(String[] args){
		System.out.print("あなたのなまえを入力してください>");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.printf("こんにちは%sさん！%n",name);
	}
}
//Q6
public class Day3{
	public static void main(String[] args){
		System.out.print("スカイツリーの高さは？(m)>");
		int height = new java.util.Scanner(System.in).nextInt();
		if(height == 634){
			System.out.println("OK!");
		}else{
			System.out.println("NG");
		}
	}
}
*/
//Q7
public class Day3{
	public static void main(String[] args){
		boolean isMarried = true;
		if(isMarried){
			System.out.println("結婚しています。");
		}else{
			System.out.println("結婚していません。");
		}
	}
}
