public class Lucky{
	public static void main(Strig[] args){
		final int LUCKY=77;
		int no;
		int count=0;
		do{
			count++;
			no= new java.util.Random().nextInt(100);
			System.out.println(no);
		}while(no != LUCKY){
			System.out.printf("%d回目に%dがでました%n",count,LUCKY);
		}
		}
	}
}
