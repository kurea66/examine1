public class Dice{
	public static void main(String[] args){
		System.out.print("サイコロを何回ふる?>");
		int num = new java.util.Scanner(System.in).nextInt();
		int sum= 0;
		int min = 6;
		int max = 1;
		double ave = 0f;
		for(int i=0;i<num;i++){
			int dice = new java.util.Random().nextInt(6)+1;
			System.out.println(dice);
			sum += dice;
			min = Math.min(min,dice);
			max = Math.max(max,dice);
		}
		ave = (sum/num);
		System.out.printf("合計は%d%n",sum);
		System.out.printf("最少は%d%n",min);
		System.out.printf("最大は%d%n",max);
		System.out.printf("平均は%.1f%n",ave);
	}
}
