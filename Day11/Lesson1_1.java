public class Lesson1_1{
	public static void main(String[] args){
		System.out.print("何段>");
		int n=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j>=n-1-i){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
