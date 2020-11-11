public class ForLesson{
	public static void main(String[] args){
		System.out.print("小さい数を入力してください>");
		int small= new java.util.Scanner(System.in).nextInt();
		System.out.print("大きい数を入力してください>");
		int large= new java.util.Scanner(System.in).nextInt();
		int sum= 0;
		if(small < large){
			for (int i=small;i <= large;i++){
				sum += i;
			} 
			System.out.printf("%dから%dまでたすと%dです。%n",small,large,sum);
		}else{
			System.out.println("値が不正です。最初の値を小さくしてください");
		}
	}
}
