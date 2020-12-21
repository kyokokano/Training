public class Pencil{
	String color;
	int penLength = 5;
	
	public Pencil(String color){
		this.color = color;
	}
	public void write(){
		penLength --;
		if(penLength < 0){
			System.out.println("もう書けません!");
		}else{
		System.out.println(this.color+"で書いた!");
		}
	}
	public void watch(){
		this.color = color;
		System.out.println("色:"+color);
		for(int i = 0; i < penLength; i++){
			System.out.print("+");
		}
		System.out.println(">");
	}
}
