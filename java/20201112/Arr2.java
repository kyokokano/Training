import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++){
			nums[i] = i;
		}
		System.out.println(Arrays.toString(nums));
		//拡張for文で全部出力
		for(int val : nums){
			System.out.println(val);
		}
		//配列を逆順にする
		for(int i = 0; i<nums.length/2;i++){//入れ替えの回数
			int temp = nums[i];
			nums[i]=nums[nums.length-1-i];//入れ替えの対象が段々内側になっていくようにする
			nums[nums.length-1-i]=temp;
		}
			System.out.println(Arrays.toString(nums));
		//配列をシャッフルする
		for(int i=0; i < nums.length-1; i++){
			int index = new Random().nextInt(nums.length-i);
			int temp = nums[index];
			nums[index] = nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
			}
			System.out.println(Arrays.toString(nums));
		//配列を昇順に並び替え
		//左端と隣を比較して小さいほうを左へ
		//左端と更に隣を比較・・・の流れ
		for(int i = 0; i < nums.length-1; i++){
			for(int j = i+1;j < nums.length; j++){
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
