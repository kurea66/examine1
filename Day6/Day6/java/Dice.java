public class Dice{
	public static void main(String[] args){
		int diceA = new java.util.Random().nextInt(6)+1;
		int diceB = new java.util.Random().nextInt(6)+1;
		System.out.println("Aさんがサイコロを振ったよ"+ diceA);
		System.out.println("Bさんがサイコロを振ったよ"+ diceB);
		int diff=Math.abs(diceA-diceB);//絶対値
		/*
		if(diceA == diceB){
			Sysem.out.println("引き分け");
		}else if(diceA > diceB){
			Sysem.out.println("Aさんの"+ diff+ "点勝ちだよ");
		}else{
			Sysem.out.println("Bさんの"+ diff+ "点勝ちだよ");
		}
		*/
		/*
		if((diceA+diceB) % 2 == 0){
			System.out.println("二人の和は偶数です");
		}else{
			System.out.println("二人の和は奇数です");
		}
		*/
	}
}
