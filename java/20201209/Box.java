public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
	public Box(String color,String shape,int num){
		this.color = color;
		this.shape = shape;
		this.num = num;
		totalNumber += num;
	}
	public void insertBalls(int num){
		this.num += num;
		totalNumber += num;
	}
	public int removeBalls(int num){
		if(this.num < num){
			int temp = this.num;
			this.num = 0;
			totalNumber -= temp;
			return temp;
		}else{
			this.num -= num;
			totalNumber -= num;
			return num;
		}
	}
	public String displayInfo(int num){
		String str = num+"---色："+this.color+", 形："+this.shape+", 個数："+this.num;
		return str;
	}
	static void displayTotalNumber(){
		System.out.println("ボールの合計は"+totalNumber+"個です。");
	}
}
