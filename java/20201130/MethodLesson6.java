import java.util.*;
public class MethodLesson6{
	public static void main(String[] args){
		System.out.print("一文字入れてください>");
		String s = new Scanner(System.in).nextLine();
		System.out.print("幅を入れてください>");
		int width = new Scanner(System.in).nextInt();
		printSquare(s.charAt(0),width);
	}
	static void printSquare(char c,int width){
		for(int i = 0; i < width; i++){
			for(int j = 0; j < width; j++){
				System.out.print('c');
			}
			System.out.println();
		}
	}
}
