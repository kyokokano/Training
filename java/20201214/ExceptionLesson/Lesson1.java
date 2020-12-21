import java.io.*;
import java.util.*;
public class Lesson1{
	public static void main(String[] args)throws Exception{//書いとけば落ちずにコンパイル通る
		FileWriter fw = new FileWriter("data.txt",true);//第２引数にtrueを入れると実行の度に追記されHello!が増える
		fw.write("hello!");
		fw.close();
		//実行するとHello!と書かれたdata.txtファイルが作られる
	}
}
