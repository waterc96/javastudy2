
/**
 * @author daixuan
 * 2018��9��29��
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
		System.out.println("ż����"+onum);
		for(int i=1;i<size/2;i++) {
			jnum=jnum+cnum[size-2*i];
		}
		System.out.println("������"+jnum);
	int he=onum+jnum;
	System.out.println(he);
	if(he%10==0) {
	System.out.println("�ɹ�");
	}else {
		System.out.println("ʧ��");
	}
}
}
