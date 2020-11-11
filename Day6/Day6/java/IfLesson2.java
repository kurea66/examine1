public class IfLesson2{
	public static void main(String[] args){
		/*
		System.out.print("あなたの年齢を入力");
		int age = new java.util.Scanner(System.in).nextInt();

		if ( age >= 20){
			System.out.println("あなたは大人です");
		}else{
			System.out.println("あなたは子供です");
		}
		*/
		/*
		int dyceA = new java.util.Random().nextInt(6);
		int dyceB = new java.util.Random().nextInt(6);
		dyceA++;
		dyceB++;
		System.out.println("Aさんがサイコロを振ったよ"+ dyceA);
		System.out.println("Bさんがサイコロを振ったよ"+ dyceB);
		
		int point = Math.max(dyceA,dyceB)-Math.min(dyceA,dyceB);

		if (dyceA == dyceB){
			System.out.println("引き分けだよ");	
		}else if(dyceA > dyceB){
			System.out.println("Aさんが"+ point + "点勝ったよ");	
		}else{
			System.out.println("Bさんが"+ point + "点勝ったよ");	
		}
		*/
		/*
		int dyceA = new java.util.Random().nextInt(6);
		int dyceB = new java.util.Random().nextInt(6);
		dyceA++;
		dyceB++;
		System.out.println("Aさんがサイコロを振ったよ"+ dyceA);
		System.out.println("Bさんがサイコロを振ったよ"+ dyceB);
		
		int comparison = (dyceA + dyceB) %2;

		if (comparison == 0){
			System.out.println("二人の目の和は偶数だったよ");	
		}else{
			System.out.println("二人の目の和は奇数だったよ");	
		}
		*/

		int dyceA = new java.util.Random().nextInt(6);
		int dyceB = new java.util.Random().nextInt(6);	
		int dyceC = new java.util.Random().nextInt(6);
		dyceA++;
		dyceB++;
		dyceC++;
		System.out.println("Aさんがサイコロを振ったよ"+ dyceA);
		System.out.println("Bさんがサイコロを振ったよ"+ dyceB);
		System.out.println("Cさんがサイコロを振ったよ"+ dyceC);
		
		if (dyceA >= dyceB){
			int comparison = Math.max(dyceA,dyceC);
			System.out.println("一番大きい目は"+ comparison +"だよ");	
		}else{
			int comparison = Math.max(dyceB,dyceC);
			System.out.println("一番大きい目は"+ comparison +"だよ");	
		}

	}
}
