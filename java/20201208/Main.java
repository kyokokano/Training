public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		Hero h1 = new Hero();
		h1.name ="ミナト";
		if(h.equals(h1)){
			System.out.println("同じです");
		}
		System.out.println(h.toString());//toStringでオーバーライドしていると(h)でもいける
	}
}
