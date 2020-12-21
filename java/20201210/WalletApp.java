import java.util.*;
public class WalletApp{
	public　static void main(String[] rgs){
		Scanner sc = new Scanner(System.in);
		Wallet wallet = new Wallet(1000);
		VendingMachine vm = new VendingMachine(3);
		while(true){
			System.out.println("現在の入金額："+vm.money+"円");
			System.out.println("1. 硬貨投入 / 2. 商品購入 / 3. 硬貨取出 / 4.商品投入 / 5.所持金表示 / 6.終了>");
			int select = sc.nextInt();
			switch(select){
				case 1:
					System.out.println("投入する金額を入力して下さい >");
					int money = sc.nextInt();
					wallet.takeOutMoney(money);
					vm.insertCoins(money);
					break;

				case 2:
					int oturi = vm.insertCoins(money)
					wallet.insertMoney(oturi);	
					break;

				case 3:
					break;
				case 4:
					break;
				case 5:
					wallet.display();
					break;
				case 6:
					return;
			}
		}
	}
}
