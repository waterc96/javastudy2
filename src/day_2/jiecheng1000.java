package day_2;
import java.math.*;
import java.util.*;
public class jiecheng1000{

	public static void main(String[] args) {
		        //����n
		        Scanner in =new Scanner(System.in);
		        int n = in.nextInt();
		 
		        //�������մ𰸵ĳ�ʼֵ
		        int pre_answer=1;
//		        int x1=1;
//		        String x3=String.valueOf(x1);
		        //���𰸳�ʼֵ��int����ת��ΪString����
		        String x=String.valueOf(pre_answer);
		        //��String���͵Ĵ𰸵ĳ�ʼֵ�����ݸ�BigInteger���ͣ���ʼ��Ϊ���յĴ�
		        BigInteger answer=new BigInteger(x);
		 
		        //ѭ������������
		        for (int i=1;i<=n;i++){
		            //��ΪBigInteger����ֻ�ܺ͸����͵ı�����ˣ���˻��轫ÿ�ε��м����Ҳ���α�ΪBigInteger����
		            String var=String.valueOf(i);
		            BigInteger variable=new BigInteger(var);
		            //������˺��������������
		            answer=answer.multiply(variable);
		        }
		        //������մ�
		        System.out.println(answer);
		        in.close();

	}

}
