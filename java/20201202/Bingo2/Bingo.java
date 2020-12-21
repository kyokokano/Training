import java.util.*;
public class Bingo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int[] centetIndex = {2,2};
		int[][] card = makeCard(5,99);

		card[centerindex[0]][centerIndex[1]] = 0;
		showCard(card);
		int[] balls = createBalls(99);
		for(int i = 0;;i++){
			cs.nextLine();
			int bingoCount = drawBallCountLine(card,balls[i]);
			System.out.printf("%d!(%d回目)",balls[i],i+1);
			if(bingoCount > 0){
				System.out.print(":BINGO!!");
			}
			System.out.println();
			if()
		}
	}
	static int[] makeNums(int max){
		int[] nums = new int[max];
		for(int i = 0; i < max; i++){
			nums[i] = i+1;
		}
		return nums;
	}
	static int[][] makeCard(int width,int max){
		int[] nums = makeNums(max);
		arrShuffle(nums);
		int[][] card
		Random rand = new Random();
		int[][] card = new int[width][width];
		for(int i = 0; i < width; i++){
			for(int j = 0 j < width; j++){
				card[i][j] = rand.nextInt(99)+1;
			}
		}
		return card;
	}
	static void arrShuffle(int[] nums){
		Random rand = new Random();
		for(int i = 0; i < nums.length-1; i++){
			int index = rand.nextInt(nums.length-i);
			int temp = nums[index];
			nums[index] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;
		}
	}
	static void showCard(int[][] card){
		for(int[] line:card){
			for(int n:line){
				String s = n ==0? "@@" : String.valueOf(n);
				System.out.printf("%3s",String.valueOf(s));
			}
			System.out.println();
		}
	}
	static int[] creatBall(int max){
		int[] balls = makeNum(max);
		arrShuffle(ball);
		return balls;
	}
	static int drawBallcountLine(int[][] card,int count,int num){
		for(int i = 0; i < card.length; i++){
			for(int j = 0; j < card[i].length; j++){
				if(card[i][j] == num){
					card[i][j] = 0;
				}
			}
		}
		int bingoLine = countBingoLine(card);
		System.out.printf("");
		return countBingoLine(card);
	}
	static boolean isSame(int[] line){
		boolean isSame = true;
		int first = line[0];
		for(int i = 1; i < line.length; i++){
			if(first != line[i]){
				isSame = false;
				break;
			}
		}
		return isSame;
	}
}
