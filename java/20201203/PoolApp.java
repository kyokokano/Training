import java.util.*;
public class PoolApp{
	public static void main(String[] args){
		Pool p = new Pool();
		Scanner sc = new Scanner(System.in);
		Double water = 0.0;
		while(true){
			System.out.print("1. 給水 / 2. 排水 / 3. 表示 / 4. 終了>");
			int select = sc.nextInt();
			switch(select){
				case 1:
					System.out.print("給水する水量を入力して下さい>");
					water = sc.nextDouble();
					p.feedWater(water);
					break;
				case 2:
					while(true){
						System.out.print("排水する水量を入力して下さい>");
						water = sc.nextDouble();
						if(water < 0){
							System.out.println("[排水量は正の値を入力して下さい>");
						}else{
							p.drainWater(water);
							break;
						}
					}
				case 3:
					p.display();
					break;

				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
	class Pool{
		final double MAX_WATER = 600d;//dでダブル型だよっていうマナー
		double water;
		public Pool(){
			this.water = 0d;
		}
		public void feedWater(double water){
			if(this.water == MAX_WATER){
				System.out.println("満水です。");
				return;
			}
			double w = Math.min(water,MAX_WATER-this.water); 
				System.out.println(w+"立法メートル給水しました。");
				this.water += w;
		}
		public void drainWater(double water){
			if(this.water < 0){
				System.out.println("これ以上は排水できません");
			}else{
				System.out.print(water+"立方メートル排水しました。");
				this.water -= water;
			}
		}
		public void display(){
			System.out.println("現在の水量は"+water+"立法メートルです。");
		}
	}
