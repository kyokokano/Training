import java.util.*;
public class ArrL2{
	public static void main(String[] args){
		int[] balls = new int[99];
		for(int i = 0; i < balls.length; i++){
			balls[i] = i+1;
		}
		int aWin = 0,bWin = 0;
		for(int i = 0; i < 5; i++){
			System.out.println(i+1+"回戦");
			int ballA = 0,ballB = 0;
			for(int j = 0; j < 2; j++){
				int index = new Random().nextInt(balls.length-(i*2+j));
				int ball = balls[index];
				if(j == 0){
					ballA = ball;
				}else{
					ballB = ball;
				}
				balls[index] = balls[balls.length-1-(i*2+j)];
				balls[balls.length-1-(i*2+j)] = ball;
			}
			String winner;
			if(ballA > ballB){
				winner = "A";
				aWin += 1;
			}else{
				winner = "B";
				bWin += 1;
			}
			System.out.printf("A:%d,B:%d...%sの勝ち%n",ballA,ballB,winner);
		}
	}
}
