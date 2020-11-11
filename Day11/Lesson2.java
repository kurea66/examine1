public class Lesson2{
	public static void main(String[] args){
		int score=0;
		while(true){
			System.out.print("何点>");
			score=new java.util.Scanner(System.in).nextInt();
			if(score<0 || score >100){
				System.out.println("点数は0から100です");
				continue;
			}
			break;
		}
		for(int i=0; i<score;i++){
			System.out.print('*');
			if((i+1)%5 == 0){
				System.out.print('|');
			}
		}
		System.out.println();
	}
}
