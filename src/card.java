
/**
 * @author daixuan
 * 2018年9月29日
 */
public class card {
public static void main(String[] args) {
	 String num="54321123456788881";
	 char[] cnum = num.toCharArray();
	 int size=cnum.length;
	 System.out.println(size);
	 int onum=Integer.valueOf( String.valueOf(cnum[size-2]));
	 int jnum=Integer.valueOf( String.valueOf(cnum[size-1]));
	 System.out.println(onum);
	 System.out.println(jnum);
	// int j=0;
//	 for(int i=1;i<=17;i++) {
//		
//		 j=j+i;
//	 }
//	 System.out.println(j);
		for(int i=1;i<size/2;i++) {
			onum=onum*2;
			if(onum>10) {
				onum=onum-9;
			}
			onum=onum+cnum[size-2*i];
		}
		System.out.println("偶数和"+onum);
		for(int i=1;i<size/2;i++) {
			jnum=jnum+cnum[size-2*i];
		}
		System.out.println("奇数和"+jnum);
	int he=onum+jnum;
	System.out.println(he);
	if(he%10==0) {
	System.out.println("成功");
	}else {
		System.out.println("失败");
	}
}
}
