public class IfLesson{
	public static void main(String[] args){
		int score=76;

		if(score >= 80){
			System.out.println("優");
		}else if(score >= 60){
			System.out.println("良");
		}else if (score >= 40){
			System.out.println("可");
		}else{
			System.out.println("不可");
		}
	}
}
