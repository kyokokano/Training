public class Archer{
	private static int totalArcher;
	private int no;
	public Archer(){
		this.totalArcher ++;
		this.no = totalArcher;
		System.out.println("Archer"+no+"を生成しました。");
	}
	public static int getTotalArcher(){
		return totalArcher;
	}
	public void shootArrow(){
		System.out.println("Archer"+this.no+"は矢を放った!");
	}
}
