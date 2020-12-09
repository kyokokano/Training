import java.util.*;
public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);
		points.add(0,25);//0番目に挿入
		int removed = points.set(3,50);//3番目におきかえ//25,10,80,50,90
		System.out.println(points.get(1));//10
		System.out.println(removed)//75
		for(int i : points){//どっちのfor文でも書けるようにする！
			System.out.println(i);//↓
		}
		for(int i = 0; i < points.size(); i++){
			System.out.println(points.get(i));
		}
		if(points.size() > 2){
		}
		if(points.size() > 0){
		}
		if(points.isEmpty()){//配列の要素は空ですか？
		}
		if(points.contains(90)){
		}
		System.out.println(points.indexOf(80));//2
		System.out.println(points.indexOf(1000));//該当がない場合は負の値（-1）が戻る
		removed = points.remove(2);
		System.out.println("削除された値:"+removed);
		points.clear();
		Integer i1 = Integer.valueOf(16);
		int i2 = i1.intValue();

		String s1 = String.valueOf(16);
		int i3 = Integer.parseInt(s1);
	}
}
