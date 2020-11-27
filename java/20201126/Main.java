import my.util.Common;
import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("配列の要素数を入力してください>");
		int count = new Scanner(System.in).nextInt();
		int[] arrRand = new int[count];
		int min = -10;
		int max = 10;
		
		arrRand = Common.arrRandomRange(min, max, count);
		System.out.println("配列を生成しました。");
		System.out.println(Arrays.toString(arrRand));

		int[] arrClone = new int[count];

		arrClone = Common.arrClone(arrRand);

		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int num = new Scanner(System.in).nextInt();
		
			if(num == 1){
				System.out.println(Arrays.toString(arrRand));
			}else if(num == 2){
		  	Common.arrSort(arrClone);
			} else if (num == 3) {
				Common.arrSort(arrClone, true);
			}else if(num == 4){
				System.out.println("アプリケーションを終了します");
				break;
			}
		}
	}
}
