package lesson2;
import java.util.Scanner;
public class Lesson2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数値(1~10000)>");
		String str = sc.nextLine();

		int[] userNum = new int[str.length()];
		int input = Integer.parseInt(str);
		for(int i = 0; i < userNum.length; i++) {
			userNum[i] = input % 10;
			input /= 10;

		}
		System.out.print("逆順にしました->");
		for(int i:userNum) {
			System.out.print(i);
		}
		System.out.println();
		sc.close();
	}

}
