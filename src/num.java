import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author daixuan
 * 2018��9��29��
 */
public class num {
private static Scanner sc;
public static void main(String[] args) {
	System.err.println("��������");
	sc = new Scanner(System.in);
	double num = sc.nextDouble();
	System.out.println(convert(num));
}
public static String convert(double inputMonney) {
    int decimalDigit = 2;//�����ұ���2λС������
    //���������ִ�д
    char[] data = {'��', 'Ҽ', '��', '��', '��', '��', '½', '��', '��', '��'}; 
    //�����л��ҵ�λ��д�����������������ռλ��
    char[] units = {'��', '��', 'Ԫ', 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ','��', 'ʰ', '��', 'Ǫ'};
    int uint = 0;
    //�������Ҳ�ʹ��ϵͳ�������Լ�ʵ���������룬ԭ����102.345,����2λ����������,
    //102.3456->102.3456*10^(2+1)=102345.6->ȥ��С������102345->102345%10=5ȡ������С��λ������һλ���֣��ж�����
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
        sbf.insert(0, units[uint++]);//���������ҵ�λ
        sbf.insert(0, data[(int) (money % 10)]);//���뵥λ����Ӧ��ֵ
        money = money / 10;
    }
    //ʹ��replaceAll�滻������+'����ҵ�λ'��,replaceAll�����old�ַ���������������ʽ
    return sbf.toString().replaceAll("��[Ǫ��ʰ]", "��").replaceAll("��+��", "��").replaceAll("��+��", "��").replaceAll("����", "����").replaceAll("��+", "��").replaceAll("��Ԫ", "Ԫ").replaceAll("��[�Ƿ�]", "");
}
}
