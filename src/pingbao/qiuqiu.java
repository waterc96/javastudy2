/**
 * 
 */
package pingbao;

/**
 * @author daixuan
 *
 * 2018��8��23��
 */
public class qiuqiu {
	int r;
	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		this.r = r;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the vx
	 */
	public int getVx() {
		return vx;
	}
	/**
	 * @param vx the vx to set
	 */
	public void setVx(int vx) {
		this.vx = vx;
	}
	/**
	 * @return the vy
	 */
	public int getVy() {
		return vy;
	}
	/**
	 * @param vy the vy to set
	 */
	public void setVy(int vy) {
		this.vy = vy;
	}
	/**
	 * @return the yuan_count
	 */
	public int getYuan_count() {
		return yuan_count;
	}
	/**
	 * @param yuan_count the yuan_count to set
	 */
	public void setYuan_count(int yuan_count) {
		this.yuan_count = yuan_count;
	}
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int yuan_count;
	public static qiuqiu[] yuans;
	
/**
	 * 
	 */
	public qiuqiu() {

	}
	//	yuans=new [myhua];	
	 /**@param x Բ�ĵ�x����
	 * @param y Բ�ĵ�y����
	 * @param r Բ�İ뾶
	 *  @param yuan_count Բ������
	 */
	public qiuqiu(int x,int y,int r,int yuan_count) {
		
		this.x=x;
		this.y=y;
		this.r=r;
		this.vx=vx;
		this.vy=vy;
		this.yuan_count=yuan_count;
	
		
}
	
	static void born(int x,int y,int cavansWidth,int cavanshight,int r,int yuan_count) {
		yuans = new qiuqiu[yuan_count];
		for(int i=0;i<yuans.length;i++) {
		int suix=(int)(Math.random()*(cavansWidth-2*r+1)+r);
		int suiy=(int)(Math.random()*(cavanshight-2*r+1)+r);
		int vx = randomSpeed();
		int vy = randomSpeed();
		yuans[i]=new qiuqiu(suix, suiy, vx, vy);
		
		}
		
		
		}
	//�����ƶ����ж��Ƿ񴥵��߽�
		public void move(int minx,int miny,int maxx,int maxy) {
			x+=vx;
			y+=y+vy;
			 vx=((x<=minx)||x>=maxx?-vx:vx);
			 vy=((y<=miny)||y>=maxy?-vy:vy);
//			
		}
	/**
	 * @return
	 */
	private static int randomSpeed() {
	int speed = (int) (Math.random() * 11 - 5);// [-5,5]
	if (speed == 0) {
		return randomSpeed();
	}
	return speed;
	}
}