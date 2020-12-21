import java.util.*;
public class Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < 100; i++){
			int num = rand.nextInt(100)+1;
			if(map.containsKey(num)){//過去に登場している
				map.put(num,map.get(num)+1);
			}else{
				map.put(num,1);//初登場なら登録して1にする
			}
		}
		System.out.print("***result***");
		System.out.println(map.size()+"種類の数値がでました");
		for(int key : map.keySet()){
			System.out.printf("%d...%d%n",key,map.get(key));
		}
	}
}
