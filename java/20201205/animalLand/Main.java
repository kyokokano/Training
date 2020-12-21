import java.util.*;
public class Main{
	public static void main(String[] args){
		Animal[] animals = new Animal[3];
	//Animal[] animals = {new Dog("ジョン"),new Cat("ミケ"),new Pig("サム")};
		animals[0] = new Dog("ジョン");
		animals[1] = new Cat("ミケ");
		animals[2] = new Pig("サム");
		for(Animal animal:animals){
			animal.makeNoize();
			if(animal instanceof Cat){//もしanimalの元の姿がCatだったらスリープもさせる
				((Cat)animal).sleep();//この場だけダウンキャストしてすぐ戻る
			}
		}
		/*
		Cat c =(Cat)animals[1];
		c.sleep();
		*/
		((Cat)animals[1]).sleep();//直接ダウンキャストを入れることもできる、優先順位（）忘れずに！
	}
}
