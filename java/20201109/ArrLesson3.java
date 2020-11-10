import java.util.Arrays;
//importを宣言することでjava.utilを省略
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA = { 3, 5, 10 };
		//宣言と同時にまとめて記入できる
		//別ではかけない
		int[] dataB = new int[] { 4, 6, 10 };
		//こっちは２行にわけて書ける　int[] dateBとint[]{4,6};
		for (int i = 0; i < dataA.length; i++){
			System.out.println(dataA[i]);
		}
			for (int n : dataB){
				System.out.println(n);
				//拡張for文
			}

			System.out.printkn(Arrays.toString(dataA));
			//いい感じに整形して出力してくれる


			double[] nums={1.1,2.2,3.3};
			//doubleの配列の書き方
			boolean[] bools={false,false,true,true};
			//booleanの配列の書き方
			String[] strs={"hoge","fuga","bar"}
			//Stringの配列の書き方
			for (int i =0; i < strs.length; i++){
				System.out.println(strs[i]);
				}
				for(String s : strs){
					System.out.println(s);
					//拡張for文で文字列を取り出す
				}
	}
}
