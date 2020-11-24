import java.util.*;
/*
public class MethodLesson5{
	public static void main(String[] args){
		int n = sumOf(3,5);
		System.out.println(n);
	}
	//戻り値のあるメソッド
	static int sumOf(int a, int b){
		return a+b;
	}
}
*/
public class MethodLesson5{
	public static void main(String[] args){
		System.out.print("言葉>");
		String str = new Scanner(System.in).next();
		String decorated = decorateStr(str);
		System.out.println(decorated);
		//System.out.println(decorateStr(str));でもできる！
	}
	static String decorateStr(String s){
		return ("***"+s+"***");
	}
}
