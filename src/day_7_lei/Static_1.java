package day_7_lei;

public class Static_1{
	public static void main(String[] args){
		System.out.println("����ExaminationDemo�е�main����������D��ʵ��");//1
		new D();
	}
}
class E{
	E(){
		System.out.println("ִ��E�Ĺ��캯��");//7
	}
	public void funcOfE(){
		System.out.println("ִ��E�ĺ���");//11
	}
}
class F{
	F(){
		System.out.println("ִ��F�Ĺ��캯��");//
	}
	public void funcOfF(){
		System.out.println("ִ��F�ĺ���");//4
	}
}
class B{
	E e=new E();//7
	static F f=new F();//2
	public String sb=getSb();//8
	static{
		System.out.println("ִ��B��static��(B����E�ĳ�Ա����,������̬F�ĳ�Ա����)");//3
		f.funcOfF();
	}
	{
		System.out.println("ִ��Bʵ������ͨ��ʼ����");//9
	}
	B(){
		System.out.println("ִ��B�Ĺ��캯��(B����E�ĳ�Ա����,������̬F���Ա����)");//10
		e.funcOfE();
	}
	public String getSb(){
		System.out.println("��ʼ��B��ʵ����Ա����sb");
		return "sb";
	}
}
class C extends B{
	static{
		System.out.println("ִ��C��static��(C�̳�B)");//5
	}
	{
		System.out.println("ִ��C����ͨ��ʼ����");
	}
	
	C(){
		System.out.println("ִ��C�Ĺ��캯��(C�̳�B)");
	}
}
class D extends C{
	public String sd1=getSd1();
	public static String sd=getSd();//6
	static{
		System.out.println("ִ��D��static��(D�̳�C)");//7
	}
	{
		System.out.println("ִ��Dʵ������ͨ��ʼ����");
	}
	D(){
		System.out.println("ִ��D�Ĺ��캯��(D�̳�C);����B��ʵ����Ա����sb��ֵΪ��"+sb+";����D��static��Ա����sd��ֵΪ��"+sd+";����D��ʵ����Ա����sd1��ֵ�ǣ�"+sd1);
	}
	static public String getSd(){
		System.out.println("��ʼ��D��static��Ա����sd");
		return "sd";
	}
	public String getSd1(){
		System.out.println("��ʼ��D��ʵ����Ա����sd1");
		return "sd1";
	}
}
