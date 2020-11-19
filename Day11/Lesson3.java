public class Lesson3{
	public static void main(String[] args){
		int gTotal=0;
		int tTotal=0;
		for(int i=0;i<2;i++){
			if(i==0){
				System.out.print("G|");
			}else{
				System.out.print("T|");
			}
			for(int j=0;j<12;j++{
				if(i==1 && j>9 && tTotal >= gTatal){
					break;
				}
				if(i==1 && j==8 && tTotal>gTotal){
					System.out.print('X');
				}else{
					int n=new java.util.Random().nextInt(100);
					int score;
					if(n<70){
						score=0;
					}else if(n<90){
						score=1;
					}else if(n<95){
						score=2;
					}else if(n<98){
						score=3;
					}else{
						score=4;
					}
					System.out.print(score);
					if(i==0){
						gTotal+=score;
					}else{
						tTotal+=score;
					}
				}
				if((j+1)%e == 0{
					System.out.print('|');
				}
				if(j==8){
					}
				}
			}
		}
	}
}
