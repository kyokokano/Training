import java.util.*;
public class Hukuro2{
	public static void main(String[] args){
		int[] balls = new int[99];
		for(int i=0;i<balls.length;i++){
			int index = new Random().nextInt(balls.length-i);
			System.out.println(balls[index]);
			int temp=balls[index];
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
		}
	}
}
