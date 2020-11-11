public class Earth{
	public static void main(String[] args){
		final double r=6371 * 1000f;
		double tyokkei= r*2*Math.PI;
		System.out.printf("地球の外周は%.1fmです%n",tyokkei);
		double rope= (tyokkei+10)/(2 * Math.PI)-r; 
		System.out.printf("紐と地球の差は%.1fmです。%n",rope);
	}
}
