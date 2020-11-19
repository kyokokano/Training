import java.util.Arrays;
public class ArrLesson4{
	public static void main(String[] args){
		//1
		int[] arrA={ 4, 8, 10 };
		//2
		int[] arrB=new int[] { 7, 1, 3 };
		//3
		for (int i = 0; i < arrA.length; i++){
			System.out.println(arrA[i]);
		}
		//4
		for (int n : arrB){
			//未読の要素がなくなるまで取り出していく
			System.out.println(n);
		}
		//5
		int[] arrC=new int[3];
		//6
		for(int i =0; int < arrC.length; i++){
			arrC[i] = arrA[i] * 2;
		}
		//7
		System.out.println(Arrays.toString(arrC));
		//8
		for(int i =0;i<arrC.length;i++){
			arrC[i]=arrC[i]+arrB[i];
		}
		//9
		System.out.println(Arrays.toString(arrC));
		//10
		int sum=0;
		//11
		for(int n:arrC){
			sum+=n;
		}
		//12
		System.out.println("合計は"+sum+"です。");
	}
}
