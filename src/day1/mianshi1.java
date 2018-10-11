/**
 * 
 */
package day1;

/**
 * @author daixuan
 * 2018Äê10ÔÂ11ÈÕ
 */
public class mianshi1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=i+sum;
			}
		}
		System.out.println(sum);
		int ge=0;
		int shi =0;
		int bai= 0;
		for(int j=100;j<1000;j++) {
			bai=j/100;
			ge=j%10;
			shi=(j-bai*100)/10;
			if(j==bai*bai*bai+shi*shi*shi+ge*ge*ge) {
				System.out.println(j);
			}
		}
		
	System.out.println("___________________________");
	int a=16;
	int b=12;
	int m=a;
	int n=b;
	int c=a;
	while(c!=0){
		 	c=a%b;
			a=b;
			b=c;
	}
	System.out.println(a);
	System.out.println(m*n/a);
	System.out.println("----------------------------------------");
	

}
}
