import java.util.*;
public class Slime{
	public static void main(String[] args){
		ArrayList<String> slimes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("ArrayListを使ってみよう!");
		System.out.println("Listにスライムを追加していってみよう。");
		while(true){
			System.out.print("スライムを追加する?(1…yes,2…no):");
			int num = sc.nextInt();sc.nextLine();
			if(num == 1){
				System.out.print("追加するスライムの名前を決めてね:");
				String name = sc.nextLine();
				slimes.add(name);
				System.out.println(name+"が現れた!!");
			}else if(num == 2){
				for(int i = 0; i < slimes.size(); i++){
					System.out.println((slimes.get(i))+"の攻撃:5ポイントのダメージを与えた!");
				}
				break;
			}
		}
	}
}
