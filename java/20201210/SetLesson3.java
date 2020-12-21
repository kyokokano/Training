import java.util.*;
public class SetLesson3{
	public static void main(String[] args){
		String[] strArray = new String[]{
			"emhjopwxaz",
			"ykxfjihxvv",
			"oqsuoeojku",
			"stvzdzdplo",
			"ftrmgkauna",
			"ackzqxlchf",
			"dqttpisosm",
			"kfcrgfxenb",
			"vwappsvdld",
			"gvovlddccr",
			"ybaoyevbsl",
			"thhujdjaqk",
			"luxrfzmlyz",
			"zpewohxhvc",
			"whcddsgogv",
			"hzyjmgrbxw",
			"mjmxnxawrw",
			"hdndjktido",
			"vymqiltdzq"
			};
		Set<String> set = new TreeSet<>(Arrays.asList(strArray));//配列をリストに変換
		System.out.println(set);//リストは勝手にArraystoStringやってくれる

		//mから始まる文字だけ消したい
		List<String> list = new ArrayList<>(set);
		System.out.println(list.get(list.size()-1));
		/*
		for(String s:list){
			if(s.startsWith("m")){
				list.remove(s);
				//拡張for文ではまわしながら削除はできない！
			}
		}
		*/
		Iterator<String> it = list.iterator();//まわしながら削除したいとき専用アイテム
		while(it.hasNext()){
			String s = it.next();
			if(s.startsWith("m")){
				it.remove();
			}
		}
		System.out.println(list);
	}
}
