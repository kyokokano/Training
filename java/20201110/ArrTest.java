import java.util.Arrays;
import java.util.Random;
public class ArrTest{
	public static void main(String[] args){
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++){
			int dice = new Random().nextInt(6)+1;
			nums[i] = dice;
			}
		System.out.println(Arrays.toString(nums));
	}
}
