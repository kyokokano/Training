public class Q5{
	public static void main(String[] args){
		int[] nums = new int[9];
		int nyuryoku = new java.util.Scanner().nextInt();
		for(int i = 1; i <= nyuryoku; i++){
			nums[i] = i;
			for(int j = 1; j <= nyuryoku.length; j++){
				nyuryoku[j] = j;
			}
		}
		int[][] totals = new int[nums][nyuryoku];
		for(int i = 0; i < nyuryoku.length; i++){
			System.out.print(nyuryoku[i] * nums);
		}
	
	}
}
