import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		System.out.print("おさるの名前を決めてください:>");
		String name = new Scanner(System.in).nextLine();
		System.out.print("おさるの歳を決めてください:>");
		int age = new Scanner(System.in).nextInt();
		Monkey m = new Monkey(name,age);
		while(true){
			System.out.println("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			int num = new Scanner(System.in).nextInt();
			if(num == 1){
				m.greet();	
			}else if(num == 2){
				m.takeuma();
			}else if(num == 3){
				m.sakadachi();
			}else if(num == 4){
				System.out.println("アプリケーションを終了します。");
				break;
			}
		}	
	}
}
