/*
//10/30-1
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("あなたの年齢を入力>");
		int age = new java.util.Scanner(System.in).nextInt();
		if(age >= 20){
			System.out.println("あなたは大人です。");
		}else{
			System.out.println("あなたは子供です。");
		}
	}
}
//10/30-2
public class MatudaQ{
	public static void main(String[] args){
		int a = new java.util.Random().nextInt(6)+1;
		int b = new java.util.Random().nextInt(6)+1;
		System.out.printf("Aさんがサイコロを振ったよ %d%n",a);
		System.out.printf("Bさんがサイコロを振ったよ %d%n",b);
		if(a > b){
			System.out.println("Aさんが勝ったよ");
		}else if(a < b){
			System.out.println("Bさんが勝ったよ");
		}else{
			System.out.println("引き分けだよ");
		}
	}
}
//10/30-3
public class MatudaQ{
	public static void main(String[] args){
		int a = new java.util.Random().nextInt(6)+1;
		int b = new java.util.Random().nextInt(6)+1;
		int c = new java.util.Random().nextInt(6)+1;
		System.out.printf("Aさんがサイコロを振ったよ %d%n",a);
		System.out.printf("Bさんがサイコロを振ったよ %d%n",b);
		System.out.printf("Cさんがサイコロを振ったよ %d%n",c);
		int max = a;
		if(max < b){
			max = b;
		}
		if(max < c){
			max = c;
		}
		System.out.printf("一番大きい目は%dだよ%n",max);
	}
}
//MathMax ver
public class MatudaQ{
	public static void main(String[] args){
		int a = new java.util.Random().nextInt(6)+1;
		int b = new java.util.Random().nextInt(6)+1;
		int c = new java.util.Random().nextInt(6)+1;
		int m = Math.max(a,b,c);
		System.out.ptintf("Aさんがサイコロを振ったよ %d%n",a);
		System.out.ptintf("Bさんがサイコロを振ったよ %d%n",b);
		System.out.ptintf("Cさんがサイコロを振ったよ %d%n",c);
		System.out.printf("一番大きい目は%dだよ%n",m);
	}
}
//10/30-4
public class MatudaQ{
	public static void main(String[] args){
		int a = new java.util.Random().nextInt(6)+1;
		int b = new java.util.Random().nextInt(6)+1;
		System.out.printf("Aさんがサイコロを振ったよ %d%n",a);
		System.out.printf("Bさんがサイコロを振ったよ %d%n",b);
		if( (a + b) % 2 == 0){
			System.out.println("２人の目の和は偶数だったよ");
		}else{
			System.out.println("２人の目の和は奇数だったよ");
			}
	}
}
//10/30-5
public class MatudaQ{
	public static void main(String[] args){
		int r = new java.util.Random().nextInt(101);
		System.out.printf("%dでした。%n",r);
		if(r >= 80){
			System.out.printf("%dは優です。%n",r);
		}else if(r >= 60){
			System.out.printf("%dは良です。%n",r);
		}else if(r >= 40){
			System.out.printf("%dは可です。%n",r);
		}else{
			System.out.printf("%dは不可です。%n",r);
		}
	}
}
//10/30-さくっとJava1
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("リンゴの値段>");
		int applePrice = new java.util.Scanner(System.in).nextInt(); 
		System.out.print("リンゴの個数>");
		int appleCount = new java.util.Scanner(System.in).nextInt(); 
		System.out.print("バナナの値段>");
		int bananaPrice = new java.util.Scanner(System.in).nextInt(); 
		System.out.print("バナナの個数>");
		int bananaCount = new java.util.Scanner(System.in).nextInt(); 
		System.out.printf("合計は%dです%n",applePrice * appleCount + bananaPrice * bananaCount);
	}
}
//11/2-1
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("お名前>");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("年齢>");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.printf("ようこそ%s(%d)さん！%n",name,age);
	}
}
//11/2-2
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("底辺>");
		double bottom = new java.util.Scanner(System.in).nextDouble();
		System.out.print("高さ>");
		double height = new java.util.Scanner(System.in).nextDouble();
		System.out.printf("底辺%.1f,高さ%.1fの三角形の面積は%.1fです！%n",bottom,height,bottom * height / 2);
	}
}
//11/2-3
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("あなたの性別をいれてください(男,女)>");
		String sex = new java.util.Scanner(System.in).nextLine();
		System.out.print("あなたの年齢をいれてください>");
		int age = new java.util.Scanner(System.in).nextInt();
		if(sex.equals("男") && age >= 18 || sex.equals("女") && age >= 16){
			System.out.println("あなたは結婚できます。");
		}else{
			System.out.println("あなたは結婚できません。");
		}
	}
}
//11/2-4
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("点数を入力>");
		int score = new java.util.Scanner(System.in).nextInt();
		if(score > 100 || score < 0){
			System.out.println("不適切な値が入力されました");
		}else{
			System.out.printf("あなたの点数は%dです%n",score);
		}
	}
}
//11/2-5
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("月を入力>");
		int month = new java.util.Scanner(System.in).nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
			System.out.printf("%d月は春です%n",month);
			break;
			case 6:
			case 7:
			case 8:
			System.out.printf("%d月は夏です%n",month);
			break;
			case 9:
			case 10:
			case 11:
			System.out.printf("%d月は秋です%n",month);
			break;
			case 12:
			case 1:
			case 2:
			System.out.printf("%d月は冬です%n",month);
			break;
			default:
			System.out.println("不正な値です");
		}
	}
}
//11/2-6
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("１つ目の整数xの値を入力してください>");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.print("２つ目の整数yの値を入力してください>");
		int y = new java.util.Scanner(System.in).nextInt();
		System.out.print("演算子(+,-,*,/,%)を半角記号で入力してください>");
		String operator = new java.util.Scanner(System.in).nextLine();
		switch(operator){
			case "+":
			System.out.printf("x+y=%d%n",x + y);
			break;
			case "-":
			System.out.printf("x-y=%d%n",x - y);
			break;
			case "*":
			System.out.printf("x✕y=%d%n",x * y);
			break;
			case "/":
			System.out.printf("x÷y=%d%n",x / y);
			break;
			case "%":
			System.out.printf("x%%y=%d%n",x % y);
		}
	}
}
//11/4-1
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("何回気合を入れますか>");
		int kiai = new java.util.Scanner(System.in).nextInt();
		while(kiai > 0){
			System.out.println("エイエイオー");
			kiai--;
		}
	}
}
//11/4-2
public class MatudaQ{
	public static void main(String[] args){
		int count = 0;
		long thick = 1L;
		long distance = 384400L * 1000000L;
		while(distance > thick){
			count++;
			thick*=2;
			System.out.printf("%d回折り曲げた(%dmm)%n",count,thick);
		}
		System.out.printf("%d回折り曲げたら月に到達します。%n",count);
	}
}
//11/4-3
public class MatudaQ{
	public static void main(String[] args){
		double radius = 6371 * 1000;
		double rope = 2 * Math.PI * radius;
		System.out.printf("Q1_Ans:%.1f%n",rope);
	}
}
//11/4-4
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("小さい数>");
		int min = new java.util.Scanner(System.in).nextInt();
		System.out.print("大きい数>");
		int max = new java.util.Scanner(System.in).nextInt();
		int sum = 0;
		for(int i = min; i <= max; i++){
			sum += i;
		}
		System.out.printf("%dから%dまでたすと%dです。%n",min,max,sum);
	}
}
//11/4-5
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("サイコロを何回ふる>");
		int num = new java.util.Scanner(System.in).nextInt();
		int sum = 0;
		int min = 6;
		int max = 1;
		for(int i = 0; i < num; i++){
			int dice =new java.util.Random().nextInt(6)+1;
			System.out.println(dice);
			sum += dice;
			if(min > dice){
				min = dice;
			}
			if(max < dice){
				max = dice;
			}
		}
		System.out.printf("合計は%d%n",sum);
		System.out.printf("最小は%d%n",min);
		System.out.printf("最大は%d%n",max);
		System.out.printf("平均は%.1f%n",(double)sum/num);
	}
}
//さくっとJava
public class MatudaQ{
	public static void main(String[] args){
		int count = 0;
		int num = 0;
		while(num != 77){
		num = 77;//new java.util.Random().nextInt(100);
		count++;
		System.out.println(num);
		}
		System.out.printf("%d回目に77が出ました！%n",count);
	}
}
//さくっとJava_do-whileで作るver
public class MatudaQ{
	public static void main(String[] args){
		int count = 0;
		int num;
		do{
			num = new java.util.Random().nextInt(100);
			System.out.println(num);
			count++;
		}while(num != 77);
		System.out.printf("%d回目に77が出ました!%n",count);
	}
}
//11/5-1
public class MatudaQ{
	public static void main(String[] args){
		int temp = 0;
		for(int i = 1; i <= 10; i++){
			temp = temp + i;
		}
		System.out.printf("1から10までの和は%dです%n",temp);
	}
}
//11/5-2
public class MatudaQ{
	public static void main(String[] args){
		for(int i = 1; i <= 20; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBazz");
				}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Bazz");
			}else{
				System.out.println(i);
			}
		}
	}
}
//11/5-3
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		System.out.println("数当てゲーム！！");
		int ran = new Random().nextInt(100)+1;
		int count = 0;
		int num = 0;
		while(num != ran){
			count++;
			System.out.print("いくつかな？>");
			num = new Scanner(System.in).nextInt();
			if(num > ran){
				System.out.println("もっと下だよ。");
			}else if(num < ran){
				System.out.println("もっと上だよ。");
			}
		}
		System.out.printf("正解!%d回で正解しました。%n",count);
	}
}
//11/6-1
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("何段>");
		int dan = new Scanner(System.in).nextInt();
		for(int i = dan; i > 0; i--){
			for(int j = 0; j < dan; j++){
				if(i > j+1){
					System.out.print(' ');
				}else{
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}
//11/6-2
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		int score;
		while(true){
			System.out.print("何点>");
			score = new Scanner(System.in).nextInt();
			if(score < 0 || score > 100){
				System.out.print("点数は0から100です");
			}else{
				break;
			}
		}
			for(int i = 1; i <= score; i++){
				System.out.print('*');
				if(i % 5 == 0){
				System.out.print('|');
				}
			}
	}
}
//11/6-3
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("G|");
		int score;
		int gScore = 0;
		int tScore = 0;
		for(int i = 0; i < 2; i++){
			if (i == 1){
				System.out.print("T|");
			}
			for(int j = 1; j < 10; j++){
				int num = 0;
				int ran = new java.util.Random().nextInt(100)+1;
				if(ran >= 1 && ran <= 70){
					num = 0;
				}else if(ran >= 71 && ran <= 90){
					num = 1;
				}else if(ran >= 91 && ran <= 95){
					num = 2;
				}else if(ran >= 96 && ran <= 98){
					num = 3;
				}else if(ran >= 98 && ran <= 100){
					num = 4;
				}
				if(i == 1 && j == 9 && gScore < tScore){
					System.out.print("x");
				}else{
					System.out.print(num);
				}
				if(i == 0){
					gScore += num;
				}else if(i == 1){
					tScore += num;
				}
				if(j % 3 == 0){
					System.out.print("|");
				}
			}
			if(i == 0){
				System.out.print(gScore);
				System.out.println();
			}
		}
		System.out.println(tScore);
	}
}
//11/9-1
public class MatudaQ{
	public static void main(String[] args){
		int total = 0;
		for(int i = 0;i < 3;i++){
			System.out.println(i+1+"回目");
			int ran = new java.util.Random().nextInt(100)+1;
				System.out.println(ran);
			if(ran == 1){
				System.out.println("1000万円");
				total += 10000000;
			}else if(ran <= 3){
				System.out.println("100万円");
				total += 1000000;
			}else if(ran <= 6){
				System.out.println("10万円");
				total += 100000;
			}else if(ran <= 10){
				System.out.println("1万円");
				total += 10000;
			}else if(ran <= 20){
				System.out.println("1000円");
				total += 1000;
			}else if(ran <= 40){
				System.out.println("100円");
				total += 100;
			}else{
				System.out.println("ハズレ");
			}
		}
		System.out.println("獲得賞金は");
		System.out.printf("%,d円でした！%n",total);
	}
}
//11/10-1
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("手を入力0.グー、1.チョキ、2.パー>");
		int youHand = new Scanner(System.in).nextInt();
		int pcHand = new Random().nextInt(3);
		String[] hands = {"グー","チョキ","パー"};
		System.out.println("PCは"+ hands[pcHand]);
		if(youHand == pcHand){
			System.out.println("あいこです");
		}else if(youHand == pcHand - 1 || youHand == pcHand + 2){
			System.out.println("あなたの勝ちです！");
		}else(pcHand == youHand - 1 || pcHand == youHand + 2){
			System.out.println("あなたの負けです");
		}
	}
}
//11/10-2
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		int[] balls = {1,2,3,4,5,};
		for(int i = 0; i < balls.length; i++){
			int index = new Random().nextInt(balls.length-i);
			int ball = balls[index];
			balls[index] = balls[balls.length-1-i];
			balls[balls.length-1-i] = ball;
			System.out.println(ball);
		}
	}
}
//11/10-3
import java.util.*;
import java.util.Arrays;
public class MatudaQ{
	public static void main(String[] args){
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++){
			nums[i] = new Random().nextInt(6)+1;
		}
		System.out.println(Arrays.toString(nums));
	}
}
//11/10-4
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++){
			nums[i] = new Random().nextInt(101);
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
//11/10-5
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		System.out.println("***nums1***");
		int[] nums1 = new int[5];
		for(int i = 0; i < nums1.length; i++){
			nums1[i] = new Random().nextInt(100)+1;
			System.out.println(nums1[i]);
		}
		System.out.println("***nums2***");
		for(int i = 0; i < nums1.length; i++){
			int[] nums2 = new int[nums1.length];
			nums2[i] = nums1[i] * 3;
			System.out.println(nums2[i]);
		}
	}
}
//11/10さくっとJava
public class MatudaQ{
	public static void main(String[] args){
		char[] x = new char[]{'H','E','L','L','O'};
		for(int i = 4; i >= 0; i--){
			System.out.print(x[i]);
		}
	}
}
*/
//11/11-1
public class MatudaQ{
	public static void main(String[] args){

	}
}
/*
//11/11さくっとJava
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("何人>");
		int human =0;
		int count = new Scanner(System.in).nextInt();
		int[] x =	new int[count];
		for(int i = 0; i < count; i++){
			human += 1;
			System.out.printf("%d人目の点数>",human);
			int score = new Scanner(System.in).nextInt();
			x[i] = score;
		}
		System.out.println(Arrays.toString(x));
	}
}
//11-16-1
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		int[][] data = new int[3][4];
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < data[i].length; j++){
				data[i][j] = new Random().nextInt(100)+1;
				System.out.printf("%4d",data[i][j]);
			}
			System.out.println();
		}
	}
}
//11-16-2
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		System.out.print("何クラス>");
		int classNum = new Scanner(System.in).nextInt();
		int[][] nums = new int[classNum][];
		for(int i = 0; i < nums.length; i++){
			System.out.printf("クラス%dは何人>",i+1);
			int studentNum = new Scanner(System.in).nextInt();
			nums[i] = new int[studentNum];
			for(int j = 0; j < nums[i].length; j++){
				System.out.printf("%d人目の点数>",j+1);
				int score = new Scanner(System.in).nextInt();
				nums[i][j] = score;
			}
		}
		System.out.println("---結果---");
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++){
				System.out.printf("%4d",nums[i][j]);
			}
			System.out.println();
		}
	}
}
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		String[] items = {"いつ","誰が","どこで","何をした",};
		String[][] data = new String[items.length][];
		for(int i = 0; i < data.length; i++){
			System.out.printf("%sはいくつ>",items[i]);
			int count = new Scanner(System.in).nextInt();
			data[i] = new String[count];
			for(int j = 0; j < data[i].length; j++){
				System.out.printf("%sをいれて>",items[i]);
				data[i][j] = new Scanner(System.in).nextLine();
				//data[i][j] = word;
			}
		}
		for(int i = 0; i < data.length; i++){
			int index = new Random().nextInt(data[i].length);
			System.out.printf(data[i][index]);
		}
		System.out.println();
	}
}
*/
/*
import java.util.*;
public class MatudaQ{
	public static void main(String[] args){
		System.out.println("--掛け算表--");
		System.out.print("n(1~9)?>");
		int n = new Scanner(System.in).nextInt();
		int[][]nums = new int[n][9];
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++){
				nums[i][j] = (i+1) * (j+1);
//				System.out.printf("%4d|",nums[i][j]);
			}
//			System.out.println();
		}
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++){
				System.out.printf("%4d|",nums[i][j]);
			}
			System.out.println();
		}
	}
}
*/
