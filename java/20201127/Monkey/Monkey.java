public class Monkey{
	 String name;
	 int age;
  public Monkey(String name,int age){
 	 this.name = name;
 	 this.age = age;
  }
  public void greet(){
	 System.out.println("こんにちは"+this.name+"("+age+"才)です。よろしく！");
  }
  public void takeuma(){
	 System.out.println(this.name+"は上手に竹馬にのった!");
  }
  public void sakadachi(){
	 System.out.println(this.name+"はひょいと逆立ちをした！");
  }
}
