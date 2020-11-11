public class Score{
	public static void main(String[] args){
		int score= new java.util.Random().nextInt(101);
		System.out.println(score+"でした。");

		if(score >= 80){
			System.out.println(score + "は優です。");
		}else if(score >= 60){
			System.out.println(score + "は良です。");
		}else if(score >= 40){
			System.out.println(score + "は可です。");
		}else{
			System.out.println(score + "は不可です。");
		}
	}
}
