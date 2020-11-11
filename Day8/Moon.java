public class Moon{
	public static void main(String[] args){
		long leng = 384400 * 1000 * 1000L;
		long paperSize= 1;
		long count = 0;
		while(leng > paperSize){
			paperSize *= 2;
			count++;
			System.out.printf("%d回折り曲げた(%dmm)%n",count,paperSize);
		}
		System.out.printf("%d回折り曲げたら月まで届きました！",count);
	}
}
