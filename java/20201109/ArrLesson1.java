public class ArrLesson1{
	public static void main(String[] args){
		int[] nums = new int[3];
		//nums複数形　３つの箱に初期値０が入っている
		System.out.println(nums.length);
//変数名＋レングスで要素数を出力
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		//各箱に代入

		System.out.println(nums[0]);
		//10が出力される
		nums[0]=nums[1]+nums[2];
		//上書きされる
		System.out.println(nums[0]);
	}
}
