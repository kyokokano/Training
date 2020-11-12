/*
import java.util.*;
public class MakeQ{
	public static void main(String[] args){
		int[] nums = new int[21];
		for(int i = 0; i < nums.length; i++){
			nums[i] = i;
			if(nums[i] % 2 == 0 && nums[i] % 3 == 0){
				System.out.println("FizzBazz");
			}else if(nums[i] % 2 == 0){
				System.out.println("Fizz");
			}else if(nums[i] % 3 == 0){
				System.out.println("Bazz");
			}else{
				System.out.println(nums[i]);
			}
		}
		System.out.println();
	}
}
*/
import java.util.*;
public class MakeQ{
	public static void main(String[] args){
		String[] when = new String[]{"昨夜未明、","10年前、","今夜","年明けに"};
		String[] who = new String[]{"私が","おじいさんが","50代男性が","みんなが"};
		String[] where = new String[]{"代々木公園のベンチで、","六本木駅で","映画館で","異世界で"};
		String[] what = new String[]{"一日中眠る","暴れる","踊る","怒られる"};
		int[] temp = new int[when.length];
		for (int i = 0; i < when.length; i++){
			int ran = new Random().nextInt(when.length);
//			when[i] =ran;
			temp[i] = ran;
		}
		System.out.println(when[temp[0]]+who[temp[1]]+where[temp[2]]+what[temp[3]]);
	}
}
