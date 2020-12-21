import java.util.*;
public class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("好きな数字は>");
		int num = sc.nextInt();sc.nextLine();//nextIntの次にnextLineがくるときは空読み処理(sc.nextLine)させる
		System.out.print("お名前>");
		String name = sc.nextLine();
		System.out.printf("%sさんの好きな数字は%dですね!%n",name,num);
	}
}
