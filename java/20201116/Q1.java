import java.util.*;
public class Q1{
	public static void main(String[] args){
		int[][] data = new int[3][4];
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < data[i].length; j++){
				int n = new Random().nextInt(100)+1; 
				data[i][j] = n;
				System.out.printf("%4d",data[i][j]);
				//実行結果の表示がずれない処理
			}
			System.out.println();
		}
	}
}
