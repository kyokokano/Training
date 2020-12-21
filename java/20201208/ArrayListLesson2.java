import java.util.*;
public class ArrayListLesson2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		System.out.println("ArrayListを使ってみよう!");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		while(true){
			System.out.println("要素追加するよ数字を入れてね(0で終了):");
			int num = sc.nextInt();
			if(num == 0){
				System.out.println("——結果——");
				System.out.println("要素数:"+count);
				System.out.print("要素:");
				for(int i:list){
					System.out.print(i+",");
				}
				System.out.println();
				break;
			}else{
				count ++;
				list.add(num);
				System.out.println(num+"をListに追加したよ!");
			}
		}
	}
}
