package data_structure;

public class Testlinked {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Linked1 l=new Linked1();
		System.out.println(l.toString());
		l.addlast("qwer");
		System.out.println(l.toString());
		l.addlast("vvs");
		System.out.println(l.toString());
		l.addfirst("888");
		System.out.println(l.toString());
		l.addfirst("awm");
		System.out.println(l.toString());
		l.addfirst("98k");
		System.out.println(l.toString());
		l.remove("98k");
		System.out.println(l.toString());
		l.remove("888");
		System.out.println(l.toString());
		l.removefirst();
		System.out.println(l.toString());
     
     
	}

}
