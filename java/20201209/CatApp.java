import java.util.*;
public class CatApp{
	public static void main(String[] args){
		System.out.println("***Cat Collection***");
		List<Cat> cats=new ArrayList<>();//要素数不明なのでリスト使用
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("1.Collect 2.Play 3.End>");
			int act=sc.nextInt();
			switch(act){
				case 1:
					cats.add(new Cat());//コンストラクタが呼ばれて生成されリストに入る
					break;
				case 2:
					if(cats.isEmpty()){//リスト要素が０のときにtrue
						System.out.println("You do not have anyone to play with.");
						continue;
					}
					for(int i=0;i<cats.size();i++){//cats.get(i)でリストからi番目の要素を取得
						System.out.printf("%d・・・%s[%s](%d)%n",i,cats.get(i).getName(),cats.get(i).getType(),cats.get(i).getIntimacy());
					}
					System.out.print("Who do you play with?>");
					int playWith=sc.nextInt();
					if(playWith < cats.size()){
						cats.get(playWith).catPlay();//playWith番目の猫を呼び出してplayメソッドを実行する
					}else{
						System.out.println("Select exits number please!!! ");
					}
					break;
				default :
					System.out.println("Game over");
					return;
			}
		}
	}
}
