import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
		System.out.print("何色の花にしますか?>");
		String color = new Scanner(System.in).nextLine();
		System.out.print("種をいくつ植えますか?>");
		int seedNum = new Scanner(System.in).nextInt();
		Flowerbed f = new Flowerbed(color,seedNum);
		while(true){
			System.out.print("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>");
			int num = new Scanner(System.in).nextInt();
			if(num == 1){
				f.drawWater();
			}else if(num == 2){
				f.waterFlower();
			}else if(num == 3){
				f.showStatus();
			}else if(num == 4){
				System.out.println("アプリケーションを終了します。");
				break;
			}
		}
	}
}
