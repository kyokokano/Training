/*
//intとdoubleとprintfと小数点第一位
public class SlackQ{
	public static void main(String[] args){
		int a = 10;
		int b = 3;
		System.out.printf("%d÷%d=%dです%n",a,b,a/b);
		//整数はint,%d

		double x = 10;
		double y = 3;
		System.out.printf("%.1f÷%.1f=%.1fです%n",x,y,x/y);
		//小数はdouble,%.1f
	}
}

//Math.maxとMath.min（最大値と最小値）
public class SlackQ{
	public static void main(String[] args){
		int a = 5;
		int b = 3;
		int m = Math.max(a,b);
		System.out.printf("大きい方は%dです。%n",m);
	}
}

//文字列(string型)を、数値(int型)に変換する
public class SlackQ{
	public static void main(String[] args){
		String age = "29";
		int n = Integer.parseInt(age);	//str→intの公式
		System.out.printf("あなたは来年%d歳になりますね%n",n+1);
	}
}

//最初から乱数
public class SlackQ{
	public static void main(String[] args){
		int r = new java.util.Random().nextInt(90)+1; //1~90
		System.out.printf("あなたは多分、%d歳ですね？%n",r);
	}
}

//入力させる＆出力する
public class SlackQ{
	public static void main(String[] args){
		System.out.print("名前を入力>");
		String name = new java.util.Scanner(System.in).nextLine();

		System.out.print("年齢を入力>");
		int age = new java.util.Scanner(System.in).nextInt();

		System.out.printf("ようこそ、%s歳の%sさん%n",age,name);
	}
}
*/
//if文の書き方
public class SlackQ{
	public static void main(String[] args){
		System.out.println("scoreを入力>");
		int score = new java.util.Scanner(System.in).nextInt();
		if(score >= 80){
			System.out.println("優");
			}else if(score >= 60){
				System.out.println("良");
			}else if(score >= 40){
				System.out.println("可");
				}else{
				System.out.println("不可");
				}
				System.out.println("終了");
	}
}
