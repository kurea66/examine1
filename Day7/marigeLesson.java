public class marigeLesson{
	public static void main(String[] args){
		System.out.print("あなたの性別を入れてください(男,女)>");
		String gender= new java.util.Scanner(System.in).next();
		System.out.print("あなたの年齢をいれてください>");
		int age=new java.util.Scanner(System.in).nextInt();
		boolean isOk=(gender.equals("男") && age >=18)
			||(gender.equals("女") && age >=16);
		if(isOk);
			}else{
				System.out.println("結婚できません");
			}
	}
}
