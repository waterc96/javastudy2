package day_2;


public class MyPoint {
	  public int x;
	  public int y;
	  

	  public String toString() {
	    //重写了object中tostring方法，默认调用。
		  return ("[" + x + "," + y + "]");
	  }

	  public static void main(String args[]){
		   MyPoint start=new MyPoint();
		   MyPoint end=new MyPoint(); 
		   MyPoint stray=new MyPoint();
	
          start.x=10;
		  start.y=10;
		  end.x=20;
		  end.y=30;
		  stray=end;
		  stray.x=47;
		  stray.y=50;
		  //重写了object中tostring方法，默认调用。所以加不加都行
		  System.out.println("Start point is "+start.toString());
		  System.out.println("Start point is "+end);
		  System.out.println("Start point is "+stray);
	  }
	
	}