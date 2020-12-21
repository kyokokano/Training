public class ElectricBicycle{
	static final int MAX = 10;//staticはあってもなくてもいい
	int battery;
	public ElectricBicycle(int wheelSize){
		super(wheelSize);
		this.battery = MAX;
	}
	@Override
	public void ride(){
		this.battery -= 5;
		if(battery > 0){
			System.out.println("坂道だってラクラクです。");
		}else{
			System.out.println("バッテリーが切れるととても重いです。");
		}
	}
	public void batteryCharge(){
		battery = MAX;
		System.out.println("バッテリーを充電しました。");
	}
}
