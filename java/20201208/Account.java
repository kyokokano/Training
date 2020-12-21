public class Account{
	String accountNumber;
	int balance;

	@Override
	public String toString(){
		//return this.balance + "円(口座番号:"+this.accountNumber+")";
		return String.format("d円(口座番号:%s)",this.balance,this.accountNumber);//printfの仲間、出力せずに文字を返す
	}
	@Override
	public boolean equals(Object o){
		if(this == 0){
			return true;
		}
		if(o instanceof Account){
			Account a = (Account)o;
			String an1 = this.accountNumber.trim();//trim前後の空白を除去
			String an2 = a.accountNumber.trim();
			if(an1.equals(an2)){
				return true;
			}
		}
		return false;
	}
}
