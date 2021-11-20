import java.util.*;
public class Ayako{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] nums = {0,0};
		String[] names = {null,null};
		for(int i =0;i<nums.length;i++){
			System.out.println("生まれ年を入力してください");
			nums[i] = sc.nextInt();
			System.out.println("名前を入力してください");
			names[i] = sc.next();
		}
		for(int i =0;i<nums.length;i++){
			int year = 2021;
			System.out.printf("%s(%d)%n",names[i],year-nums[i]);
		}
	}
}
