import java.util.Arrays;
import java.util.Random;

public class ArrTest2{
	public static void main(String[] args){
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++){
			int ran = new Random().nextInt(101);
			nums[i] = ran;
			System.out.println("nums["+i+"]:"+nums[i]);
		}
	}
}
