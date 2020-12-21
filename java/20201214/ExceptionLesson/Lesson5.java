import java.util.*;
public class Lesson5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,30,40};
		while(true){
			System.out.print("index(q:終了)>");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("q")){//大文字小文字どっちでもqであれば
				System.out.println("終了");
				return;
			}
			try{
				int index = Integer.parseInt(str);//入力がｑでない場合intに変換
				System.out.println(arr[index]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("error:数値は0~"+(arr.length-1));//+と-は優先度一緒で左から処理されるから()必須！
			}catch(NumberFormatException e){
				System.out.println("error:1,2...のような数値で入力");
			}
		}
	}
}
