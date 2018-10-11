package day_2;
import java.math.*;
import java.util.*;
public class jiecheng1000{

	public static void main(String[] args) {
		        //输入n
		        Scanner in =new Scanner(System.in);
		        int n = in.nextInt();
		 
		        //输入最终答案的初始值
		        int pre_answer=1;
//		        int x1=1;
//		        String x3=String.valueOf(x1);
		        //将答案初始值由int类型转变为String类型
		        String x=String.valueOf(pre_answer);
		        //将String类型的答案的初始值，传递给BigInteger类型，初始化为最终的答案
		        BigInteger answer=new BigInteger(x);
		 
		        //循环迭代逐次相乘
		        for (int i=1;i<=n;i++){
		            //因为BigInteger类型只能和该类型的变量相乘，因此还需将每次的中间乘数也依次变为BigInteger类型
		            String var=String.valueOf(i);
		            BigInteger variable=new BigInteger(var);
		            //调用相乘函数进行相乘运算
		            answer=answer.multiply(variable);
		        }
		        //输出最终答案
		        System.out.println(answer);
		        in.close();

	}

}
