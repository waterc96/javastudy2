/**
 * 
 */

/**
 * @author daixuan
 *
 * 2018��9��10��
 */
class Base{
	/**
	 * 
	 */
	public Base() {
		// TODO Auto-generated constructor stub
	}
		public Base(String s){
			System.out.println("Base: "+s);
		}
	}
public	class SubA extends Base{
		public SubA(String s){
			System.out.println("SubA: "+s);
		}
		public static void main(String[] args){
			new SubA("hello");
		}
	}