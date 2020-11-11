public class Lesson1{
	public static void main(String[] args){
		System.out.print("何段?>");
		int num=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			for(int j=num-1;j>=0;j--){
				if(i>=j){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println("");
		}
	}
}
