public class Hero{
	//フィールド（パラメータ・属性）
	String name;
	int hp = 100;
//コンストラクタ（インスタンスさせる方法を定義＆初期化処理）	
	//クラスにコンストラクタを書かなければ暗黙で引数なしのコンストラクタ
	//public Hero(){}がコンパイル時に自動で追加される
	public Hero(String name){
		this.name = name;
	}
	public Hero(String name,int hp){
		this(name);//上と同じ処理をさせるthis()、呼び出しは一つに一回
		this.hp = hp;
	}
//メソッド（何ができるかを定義）
	public void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec){
		this.hp += sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp -= 5;
		System.out.println(this.name+"は、転んだ!");
		System.out.println("5のダメージ!");
	}
	public void run(){
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GameOver");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
