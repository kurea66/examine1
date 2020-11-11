public class task1{
	public static void main(String[] args){
		System.out.print("１つ目の整数xの値を入力してください>");
		int x1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("２つ目の整数yの値を入力してください>");
		int y1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("演算子(+,-,*,/,%)を半角記号で入力してください>");
		String operator = new java.util.Scanner(System.in).next();

		switch(operator){
			case ("+"):
				System.out.printf("x+y=%d",x1+y1);
				break;
			case ("-"):
				System.out.printf("x-y=%d",x1-y1);
				break;
			case ("*"):
				System.out.printf("x*y=%d",x1*y1);
				break;
			case ("/"):
				System.out.printf("x/y=%d",x1/y1);
				break;
			case ("%"):
				System.out.println("x%y="+ (x1%y1));
				break;
			default:
				System.out.println("不正な値です");
		}
	}
}
