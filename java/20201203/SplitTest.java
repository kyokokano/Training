import java.util.*;
public class SplitTest{
	public static void main(String[] args){
		String str = args[0];
		String[] data = str.split(",");
		System.out.println(Arrays.toString(data));
		int sum = 0;
		for(int i = 0; i < data.length; i++){
			sum += Integer.parseInt(data[i]);
		}
		System.out.printf("引数の合計は%dです%n",sum);
	}
}
