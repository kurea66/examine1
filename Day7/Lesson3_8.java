public class Lesson3_8{
	public static void main(String[] args){
		System.out.print("点数を入力>");
		int score= new java.util.Scanner(System.in).nextInt();
		if(score <= 100 && score >=0){
			System.out.printf("あなたの点数は%d点です%n",score);
		}else{
			System.out.println("不適切な値が入力されました");
		}
	}
}
