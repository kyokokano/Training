import java.util.*;
public class BoxApp{
	public static void main(String[] args){
		Box[] box = new Box[2];
		box[0] = new Box("赤","円形",1);
		box[1] = new Box("青","四角",2);
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("1. ボール投入 / 2. ボール取出 / 3. ボール総数表示 / 4. 終了>");
			int select = sc.nextInt();
			switch(select){
				case 1:
					for(int i = 0; i < box.length; i++){
						System.out.println(box[i].displayInfo(i));
					}
					System.out.print("ボールを投入する箱の番号を入力して下さい >");
					int index = sc.nextInt();
					if(index == 0 ||index == 1){
						System.out.print("投入するボールの個数を入力して下さい >");
						int num = sc.nextInt();
						box[index].insertBalls(num);
						System.out.println(num+"個のボールを入れました。");
					}else{
						System.out.println("箱の番号の入力が誤っています。");
					}
					break;
					
				case 2:
					for(int i = 0; i < box.length; i++){
						System.out.println(box[i].displayInfo(i));
					}
					System.out.print("ボールを取り出す箱の番号を入力して下さい >");
					index = sc.nextInt();
					if(index == 0 ||index == 1){
						System.out.print("取り出すボールの個数を入力して下さい >");
						int num = sc.nextInt();
						int ret = box[index].removeBalls(num);
						System.out.println(ret+"個のボールを取り出しました。");
					}else{
						System.out.println("箱の番号の入力が誤っています。");
					}
					break;

				case 3:
					Box.displayTotalNumber();
					break;

				case 4:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
