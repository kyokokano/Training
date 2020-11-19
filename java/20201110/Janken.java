import java.util.*;
public class Janken{
	public static void main(String[] args){
		String[] hands={"グー","チョキ","パー"};
		System.out.print("手を入力0.グー,1.チョキ,2.パー>");
		int userHand = new Scanner(System.in).nextInt();
		int pcHand = new Random().nextInt(hands.length);
		System.out.printf("pcは%s%n",hands[pcHand]);
		if(userHand == pcHand){
			System.out.println("あいこです");
		}else if(userHand == 0 && pcHand == 1
		|| userHand == 1 && pcHand == 2
		|| userHand == 2 && pcHand == 0){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
	}
}
