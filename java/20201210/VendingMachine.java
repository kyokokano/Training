public class VendingMachine{
	private int money;
	private int num;
	public VendingMachine(int n){
		money = 0;
		num = 3;
	}
	public void insertCoins(int money){
		this.money += money;
		System.out.println("現在の入金額:"+money+"円");
	}
	public void cancel{
	}
	public int purchase(int money){
			if(num <= 0){
				System.out.println("品切れ");
			}else if(money <= 100){
				System.out.println("お金が足りません");
			}else{
				money -= 100;
				System.out.println("現在の入金額:0円");
				return money;
			}
	}
	public insertGoods(){
		 }
ddu
}
