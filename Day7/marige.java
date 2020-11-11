public class marige{
	public static void main(String[] args){
		System.out.print("あなたの性別をいれてください(男,女)>");
		String sex= new java.util.Scanner(System.in).nextLine();
		System.out.print("あなたの年齢を入力しでください>");
		int age = new java.util.Scanner(System.in).nextInt();
		if(sex.equals("男") && age >= 18 ){
			System.out.println("結婚できます");
		}else if(sex.equals("男") && age < 18 ){
			System.out.println("結婚できません");
		}else if(sex.equals("女") && age < 18 ){
			System.out.println("結婚できません");
		}else{
			System.out.println("結婚できます");
		}
	}
}
