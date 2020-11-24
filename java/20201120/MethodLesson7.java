import java.util.*;
/*
public class MethodLesson7{
	public static void main(String[] args){
		System.out.print("月を入力してください>");
		int month = new Scanner(System.in).nextInt();
		int nums = num(month);
		System.out.printf("%d月の日数は%d日です。%n",month,nums);
	}
	static int num(int month){
		if(month == 2){
			return 8;
		}else if(month == 4 || month == 6 || month == 9|| month == 11){
			return 30;
		}else{
			return 31;
		}
	}
}
public class  MethodLesson7{
	public static void main(String[] args){
		System.out.print("繰り返す文字>");
		String word = new Scanner(System.in).nextLine();
		System.out.print("繰り返す回数>");
		int count = new Scanner(System.in).nextInt();
		String a = sumOf(word,count);
		System.out.println(a);
	}
	static String sumOf(String word,int count){
		String str = "";
		for(int i = 0; i < count; i++){
			str = str + word;
		}
		return str;
	}
}
public class MethodLesson7{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		double weightKg = new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double heightCm = new Scanner(System.in).nextDouble();
		double bmi = calcBMI(weightKg,heightCm);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです%n",weightKg,heightCm,bmi);
	}
	static double calcBMI(double weightKg,double heightCm){
		double bmi = weightKg /( (heightCm / 100)*(heightCm / 100));
		return bmi;
	}
}
*/
public class MethodLesson7{
	public static void main(String[] args){
		System.out.println("****TriangleCalculator****");
		System.out.print("どうする？1...三角形の面積を求める 0...やめる>");
		int ans = new Scanner(System.in).nextInt();
		if(ans == 0){
			System.out.println("アプリケーションを終了します。");
		}else if(ans == 1){
			System.out.print("底辺を入力してください>");
			double bottom = new Scanner(System.in).nextDouble();
			System.out.print("高さを入力してください>");
			double height = new Scanner(System.in).nextDouble();
			double a = triangle(bottom,height);
			System.out.printf("底辺:%.2f,高さ:%.2fの三角形の面積は%.2fです。%n",bottom,height,a);
		}
	}
	static double triangle(double bottom,double height){
		double b = bottom * height / 2;
		return b;
	}
}
