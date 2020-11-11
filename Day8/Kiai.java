public class kiai{
	public static void main(String[] args){
		System.out.print("何回気合をいれますか？>");
		int kiai= new java.util.Scanner(System.in).nextInt();
		while(kiai > 0){
				kiai--;
				System.out.println("エイエイオー");
		}
		System.out.println("頑張ってください");
	}
}
