import java.util.*;
public class BingoGame{
	public static void main(String[] args) throws Exception{
		//ここを記述
		Scanner sc = new Scanner(System.in);
		System.out.print("あなたの名前を入力してください>");
		String userName = sc.nextLine();
		System.out.print("あなたの年齢を入力してください>");
		int userAge = sc.nextInt();
		Bingo b = new Bingo(userName,userAge,100);
		System.out.printf("こんにちは%s(%d才)さん。%n",userName,userAge);
		if(b.ageCheck()){
			System.out.println("18歳未満の方は遊戯できません");
			return;
		}
		System.out.println("残り枚数:"+b.coin);
		while(true){
			System.out.print("BET枚数を入力。0で終了 1-100>");
			int bet = sc.nextInt();
			if(bet == 0){
				break;
			}else{
				b.play(bet);
				if(b.coin == 0){
					System.out.println("コインがなくなりました");
					break;
				}
			}
		}
		System.out.println("Game Over");
	}
}
class Bingo{
  final int BINGO_RATIO=12;
	String userName;
	int userAge;
	int coin;
	public Bingo(String userName,int userAge,int coin){
		//ここを記述
		this.userName = userName;
		this.userAge = userAge;
		this.coin = coin;
	}
	public boolean ageCheck(){
	 //ここを記述
	 if(userAge < 18){
			return true;
	 }else{
		 return false;
	 }
	}
	public void play(int bet) throws Exception{
		if(this.coin < bet){
			System.out.println("コインが不足しています");
			return;
		}
		this.coin -= bet;
		Random rand=new Random();
		int[] table=new int[9];
		for(int i=0;i<9;i++){
			/*ここに1秒止める処理を記述*/
			Thread.sleep(1000);
			table[i]=rand.nextInt(10);
			System.out.print(table[i]);
			if((i+1) % 3==0){
				System.out.println();
			}
		}
		int bingoCount=bingoCount(table);
		if(bingoCount==0){
			System.out.println("boo");
		}else{
			int win=bet*BINGO_RATIO*bingoCount;
			System.out.println(bingoCount+" LINE BINGO!!win:"+win);
			this.coin += win;
		}
		System.out.printf("%sさんの所持コイン:%d%n",this.userName,this.coin);
	}	
	public int bingoCount(int[] table){
		int[][] bc={
			{0,1,2},{3,4,5},{6,7,8},
			{0,3,6},{1,4,7},{2,5,8},
			{0,4,8},{2,4,6}
		};
		int bingo=0;
		for(int i=0;i<bc.length;i++){
			int[] c= bc[i];
			if(table[c[0]] == table[c[1]] && table[c[0]] == table[c[2]]){
				bingo++;
			}
		}
		return bingo;
	}
}
