/*
//Q1
public class ArrL{
	public static void main(String[] args){
		int[] nums = new int[3];
		System.out.println(nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		System.out.println(nums[0]);

		nums[0] = nums[1] + nums[2];
	}
}
//Q2
import java.util.*;
public class ArrL{
	public static void main(String[] args){
		int[] data = new int[5];
		System.out.println(data[0]);
		System.out.println(data.length);
		data[0] = 100;
		data[4] = 150;
		data[2] = 120;
		data[1] = data[2] - data[0];
		System.out.println(data[1]);
	}
}
//Q3
//import java.util.Arrays;
public class ArrL{
	public static void main(String[] args){
		int[] dataA = {3,5,10};
		int[] dataB = new int[]{4,6,10};
		for (int i = 0; i < dataA.length; i++){
			System.out.println(dataA[i]);
		}
		for (int n : dataB){
		System.out.println(n);
		}
		System.out.println(Arrays.toString(dataA));
	}
}
//Q4
import java.util.Arrays;
public class JoytasQ{
	public static void main(String[] args){
		//1
		int[] arrA = {4,8,10};
		//2
		int[] arrB = new int[]{7,1,3};
		//3
		for(int i = 0; i < arrA.length; i++){
			System.out.println(arrA[i]);
		}
		//4
		for(int n : arrB){
			System.out.println(n);
		}
		//5
		int[] arrC = new int[3];
		//6
		for(int i = 0; i < arrC.length;i++){
			arrC[i] = arrA[i] * 2;
		}
		//7
		System.out.println(Arrays.toString(arrC));
		//8
		for(int i = 0; i < arrC.length; i++){
			arrC[i] += arrB[i];
		}
		//9
		System.out.println(Arrays.toString(arrC));
		//10
		int sum = 0;
		//11
		for(int n : arrC){
			sum += n;
		}
		//12
		System.out.printf("合計は%dです。%n",sum);"
	}
}
*/
//Test
import java.util.Arrays;
import java.util.*;
public class ArrL{
	public static void main(String[] args){
		int ran = 0;
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++){
			nums[i] = new Random().nextInt(6)+1;
		}
		System.out.println(Arrays.toString(nums));
	}
}
