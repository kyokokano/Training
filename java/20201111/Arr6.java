import java.util.*;
public class Arr6{
	public static void main(String[] args){
		char[] chars = new char[]{'H','E','L','L','O'};
		for(int i = 0; i <chars.length/2; i++){
			char temp = chars[i];
			chars[i] = chars[chars.length-1-i];
			chars[chars.length-1-i] = temp;
		}
		System.out.print(Arrays.toString(chars));
	}
}
