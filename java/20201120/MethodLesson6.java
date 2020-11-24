import java.util.*;
/*
public class MethodLesson6{
	public static void main(String[] args){
		System.out.print("整数a>");
		int a = new Scanner(System.in).nextInt();
		System.out.print("整数b>");
		int b = new Scanner(System.in).nextInt();
		int max = maxOf(a,b);
		System.out.println("大きい方は"+max);
	}
	static int maxOf(int a,int b){
		return a>b ? a : b;
	}
}
*/
public class MethodLesson6{
	public static void main(String[] args){
		System.out.println(decorateStr("Hello",2));
		System.out.println(decorateStr("Hello",1));
	}
	static String decorateStr(String str,int num){
		if(num % 2 == 0){
			return "***" + str + "***";
		}else{
			return "---" + str + "---";
		}//if使うときは全部戻るように書かないとコンパイルエラーになる
	}
	static void methodA(int a){
		if(a < 0){
			return;
		}
		System.out.println(a);//retuenをif抜ける時に使うことができる（処理を終わらせたい時に使える）
	}
}
