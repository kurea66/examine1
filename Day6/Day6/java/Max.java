public class Max{
	public static void main(String[] args){
		int diceA = new java.util.Random().nextInt(6)+1;
		int diceB = new java.util.Random().nextInt(6)+1;
		int diceC = new java.util.Random().nextInt(6)+1;
		//最大値を格納する変数を用意してとりあえずdiceAを入れておく
		int max=diceA;
		//もしdiceBの値がmaxを超えたら記録更新
		if(diceB > max){
			max=diceB;//maxを更新
		}
		if(diceC > max){
			max=diceC;
		}
		System.out.println("最大値は"+ max +"です");

		int ans = Math.max(diceA,Math.max(diceB,diceC));
	}
}
