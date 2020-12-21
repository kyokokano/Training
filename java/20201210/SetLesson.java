import java.util.*;
public class SetLesson{
	public static void main(String[] args){
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黃");
		colors.add("赤");//重複したデータははいらない
		System.out.println("色は"+colors.size()+"種類");//3種類
		for(String s:colors){
			System.out.println(s);
		}
		Set<String> words = new TreeSet<>();//自然順（辞書順）に格納される
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for(String s:words){
			System.out.println(s);
		}
		Set<Integer> nums = new LinkedHashSet<>();//格納順にしたければHashSetを使う
		nums.add(1);
		nums.add(3);
		nums.add(2);
		nums.add(11);
		nums.add(6);
		for(int i:nums){
			System.out.println(i);
		}
	}
}
