import java.util.Arrays;
//importを宣言することでjava.utilを省略
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA = { 3, 5, 10 };
		int[] dataB = new int[] { 4, 6, 10 };

		for (int i = 0; i < dataA.length; i++){
			System.out.println(dataA[i]);
		}
			for (int n : dataB){
				System.out.println(n);
			}
			System.out.printkn(Arrays.toString(dataA));
	}
}
