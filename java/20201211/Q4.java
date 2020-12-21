import java.util.*;
public class Q4{
	public static void main(String[] args){
		Random rand = new Random();
		Map<Integer, Integer> map = new TreeMap<>
		int countA = 0;
		int countB = 0;
		for(int i = 0; i < 500; i++){
			int dice = rand.nextInt(6)+1;
			if(map.containsKey(dice)){
				map.put(dice,map.get(dice)+1);
				countA ++;
			}else{
				map.put(dice,1);
				countB ++;
				if(countB == 6){
					map.put(countA+countB,((countA+countB)*300));
					System.out.print(countA+countB+"("+(countA+countB)+"):"
				}
			}
		}
	}
}
