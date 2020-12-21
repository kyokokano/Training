public class Flowerbed{
	final int MAXWATER=3; //一度に持てる水の最大値
	String color; //花の色
	int seedNum; //種の数
	int bloom; //咲いた花の数
	int water; //水の量
	public Flowerbed(String color,int seedNum){
		this.color = color;
		this.seedNum = seedNum;
	}
	//水を汲むメソッド
	//一度水汲みを行うとMAXWATERになる
	public void drawWater(){
		if(this.water < MAXWATER){
			int temp = MAXWATER - water;
			this.water = MAXWATER;
			System.out.println("水を"+temp+"杯汲みました。");
		}else{
			System.out.println("水は満杯です。");
		}
	}
	//花に水を撒くメソッド
	//１回の水撒きで水を1消費する。
	//水を1消費することで花が1つ咲く
	public void waterFlower(){
		if(this.water <= 0){
			System.out.println("水が空っぽです。");
		}else if(seedNum <= 0){
			System.out.println("すべての花が咲いています!");
		}else{
			System.out.println("水を撒きました。");
			water --;
			bloom ++;
			seedNum --;

		}
	}
	//現在の花壇の状態を表示するメソッド
	//花の色を表示し#と*と.を使って花壇を描画する。(*が花で.が種)
	//#*....#
	public void showStatus(){
		System.out.println("花の色は"+color);
		System.out.print("#");
		for(int i = 0; i < bloom; i++){
			System.out.print("*");
		}
		for(int i = 0; i < seedNum; i++){
			System.out.print(".");
		}
		System.out.println("#");
	}
}
