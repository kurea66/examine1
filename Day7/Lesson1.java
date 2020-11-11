public class Lesson1{
	public static void main(String[] args){
		System.out.print("お名前>");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("年齢>");
		String age = new java.util.Scanner(System.in).nextLine();
		//System.out.println("ようこそ"+ name + "(" +age+ ")さん！"); 
		System.out.printf("ようこそ%s(%s)さん！%n",name,age);
	}
}
