public class WhileLesson{
	public static void main(String[] args){
		int temp=30;
		while (temp > 25){
			temp--;
			System.out.println("温度を一度下げました");
		}
		System.out.println("現在の室温は" + temp);
	}
}
