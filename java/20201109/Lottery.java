public class Lottery{
	public static void main(String[] args){
		int count = 3;
		int sum = 0;
		for(int i = 0; i < count; i++){
				System.out.println(i+1+"回目");
				int lot = new java.util.Random().nextInt(100)+1;
				System.out.println(lot);
				if(lot == 1){
					System.out.println("1000万円");
					sum += 10000000;
				}else if(lot <= 3){
					System.out.println("100万円");
					sum += 1000000;
				}else if(lot <= 6){
					System.out.println("10万円");
					sum += 100000;
				}else if(lot <= 10){
					System.out.println("1万円");
					sum += 10000;
				}else if(lot >= 11 && lot <=20){
					System.out.println("1000円");
					sum += 1000;
				}else if(lot >= 21 && lot <=40){
					System.out.println("100円");
					sum += 100;
				}else{
					System.out.println("ハズレ");
				}	
			}
			System.out.println("獲得賞金は");
			System.out.printf("%,d円でした!%n",sum);
	}
}
