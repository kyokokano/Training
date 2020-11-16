import java.util.*;
public class MakeQ{
	public static void main(String[] args){
		String[] itu = new String[]{"昨夜未明、","10年前、","今夜","年明けに"};
		String[] dare = new String[]{"私が","おじいさんが","50代男性が","みんなが"};
		String[] doko = new String[]{"代々木公園のベンチで、","六本木駅で","映画館で","異世界で"};
		String[] nani = new String[]{"一日中眠る","暴れる","踊る","怒られる"};
		int[] temp = new int[itu.length];
		for (int i = 0; i < itu.length; i++){
			int ran = new Random().nextInt(itu.length);
			temp[i] = ran;
		}
		System.out.println(itu[temp[0]]+dare[temp[1]]+doko[temp[2]]+nani[temp[3]]);
	}
}
