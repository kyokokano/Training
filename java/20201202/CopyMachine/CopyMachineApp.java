import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("最初に給紙する枚数を入力して下さい>");
		int sheet = sc.nextInt();
		CopyMachine cm = new CopyMachine(sheet);
		while(true){
			System.out.print("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>");
			int num = sc.nextInt();
			if(num == 1){
				System.out.print("給紙する枚数を入力して下さい>");
				sheet = sc.nextInt();
				cm.feedPaper(sheet);
			}else if(num == 2){
				System.out.print("コピーする枚数を入力して下さい>");
				sheet = sc.nextInt();
				cm.copy(sheet);
			}else if(num == 3){
				cm.display();
			}else if(num == 4){
				System.out.println("アプリケーションを終了します。");
				break;
			}
		}
	}
}
