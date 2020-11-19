import java.util.Arrays;
import java.util.Random;
public class Ball{
	public static void main(String[] args){
		int[] a = new int[5];
		int[] b = new int[5];
		
		for(int i = 0; i < a.length; i++){
		int ball = new Random().nextInt(99)+1;
		a[i] = ball;
		b[i] = ball;
		if(a[i] > b[i]){
			System.out.println("A:"+a[i]+",B:"+b[i]+"...Aの勝ち");
		}else if(a[i] < b[i]){
			System.out.println("A:"+a[i]+",B:"+b[i]+"...Bの勝ち");
		}else{
			System.out.println("uaaaaaaaaa");
		}
		}
	}
}
