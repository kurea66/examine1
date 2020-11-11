public class WhileLesson2{
	public static void main(String[] args){
		int temp=30;
		do{
			temp--;
			System.out.println("温度を一度下げました。");
		}while(temp > 25);
		System.out.println("現在の室温は"+ temp + "です。");
	}
}
