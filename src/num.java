import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author daixuan
 * 2018年9月29日
 */
public class num {
private static Scanner sc;
public static void main(String[] args) {
	System.err.println("请输入金额");
	sc = new Scanner(System.in);
	double num = sc.nextDouble();
	System.out.println(convert(num));
}
public static String convert(double inputMonney) {
    int decimalDigit = 2;//人名币保留2位小数到分
    //汉语中数字大写
    char[] data = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'}; 
    //汉语中货币单位大写，这样的设计类似于占位符
    char[] units = {'分', '角', '元', '拾', '佰', '仟', '万', '拾', '佰', '仟', '亿', '拾', '佰', '仟','兆', '拾', '佰', '仟'};
    int uint = 0;
    //在这里我不使用系统函数，自己实现四舍五入，原理：如102.345,保留2位并四舍五入,
    //102.3456->102.3456*10^(2+1)=102345.6->去掉小数部分102345->102345%10=5取到保留小数位数的下一位数字，判断舍入
   long money = (long)(inputMonney * Math.pow(10, decimalDigit + 1));
    BigDecimal b=new BigDecimal(inputMonney);
    BigDecimal money1=(b.setScale(2, RoundingMode.UP));
 //  double money=(((int)(inputMonney*100+0.5))*0.01);
    System.out.println(money);
    if (money % 10 > 4) {
        money = (money / 10) + 1;
    } else {
        money = money / 10;
    }
    StringBuffer sbf = new StringBuffer();
    while (money != 0) {
        sbf.insert(0, units[uint++]);//插入人名币单位
        sbf.insert(0, data[(int) (money % 10)]);//插入单位所对应的值
        money = money / 10;
    }
    //使用replaceAll替换掉“零+'人民币单位'”,replaceAll里面的old字符串可以是正则表达式
    return sbf.toString().replaceAll("零[仟佰拾]", "零").replaceAll("零+万", "万").replaceAll("零+亿", "亿").replaceAll("亿万", "亿零").replaceAll("零+", "零").replaceAll("零元", "元").replaceAll("零[角分]", "");
}
}
