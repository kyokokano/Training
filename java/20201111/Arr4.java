import java.util.*;
public class Arr4{
	public static void main(String[] args){
		int[] nums = new int [10];
		String[] strs = new String[10];
		for(int i = 0; i < nums.length; i++){
			int n = new Random().nextInt(10);
			nums[i] = n;			
			strs[i] = nums[i] %2 == 0 ? "偶数":"奇数";
			System.out.print(nums[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(strs));
	}
}
