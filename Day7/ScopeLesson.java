public class ScopeLesson{
	public static void main(String[] args){
		int x=10;
		int y=0;
		if(x == 10){
			y=100;
			System.out.printf("xは%d、yは%dです。%n",x,y);
		}else{
			y=200;
		}
		System.out.println(y);
	}
}
