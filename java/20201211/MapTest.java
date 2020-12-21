import java.util.*;
public class MapTest{
	public static void main(String[] args){
		Map<String,Integer> prefs = new HashMap<>();//今回は<>が文字列とintなので
		prefs.put("京都",255);//addじゃないので注意！
		prefs.put("東京",1261);
		prefs.put("熊本",181);
		int tokyo = prefs.get("東京");//get東京で255が帰ってくる、インデックスが東京になった感じ
		System.out.println("東京の人口は"+tokyo);
		prefs.remove("京都");
		prefs.put("熊本",182);//上書きもsetじゃないので注意!
		int kumamoto = prefs.get("熊本");
		System.out.println("熊本県の人口は"+kumamoto);
		for(String key:prefs.keySet()){//取り出しはいつもと書き方が違うので注意
			int value = prefs.get(key);
			System.out.println(key+"の人口は"+value);
		}
	}
}
