public class AgeLesson{
	public static void main(String[] args){
		System.out.println("あなたの年齢を入力");

		String ageString= new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);

		if (age >= 20){
			System.out.println("あなたは大人です");
		}else{
			System.out.println("あなたは子供です");
		}
	}
}
