public class Lesson2{
	public static void main(String[] args){
		System.out.print("底辺");
		double wide= new java.util.Scanner(System.in).nextDouble();
		System.out.print("高さ");
		double high= new java.util.Scanner(System.in).nextDouble();
		//System.out.print("底辺" + wide + ",高さ" + high + "の三角形の面積は" + ((wide*high)/2) + "です！");
		System.out.printf("底辺%.2f,高さ%.2fの三角形の面積は%.2fです!%n",wide,high,wide*high/2);
	}
}
