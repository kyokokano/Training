import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Bicycle bicycle = new Bicycle(24);
		ElectricBicycle eb = new ElectricBicycle(27);
		while(true){
			System.out.println("自転車を選んでください");
			System.out.println("0・・・自転車/ホイールサイズ:27");
			System.out.println("1・・・電動自転車/ホイールサイズ:24 バッテリー:10");
			System.out.println("2・・・終了");
			System.out.print("番号を入力してください>");
			int firstNum = sc.nextInt();
			switch(firstNum){
				case 0:
					while(true){
						System.out.print("1/走る,2/降りる>");
						int secondNum = sc.nextInt();
						if(secondNum == 1){
							bicycle.ride();
						}else if(secondNum == 2){
							bicycle.off();
								break;
						}
					}
				case 1:
					while(true){
							System.out.print("1/走る,2/降りる,3/充電>");
							int thirdNum = sc.nextInt();
							switch(thirdNum){
								case 1:
									Bycycle = 
									eb.ride();
									break;
								case 2:
									eb.off();
									break;
								case 3:
									eb.batteryCharge();
									break;
							}
					}
				default:
					System.out.println("アプリケーションを終了します。");
			}
		}
	}
}
