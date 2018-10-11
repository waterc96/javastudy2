/**
 * 
 */
package xiangmu;


import java.io.InputStream;
import java.io.ObjectInputStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;



import JDBC.DButil;

/**
 * @author daixuan
 * 2018��9��20��
 */
public class servers {
	private static ArrayList<Environment> sdate;

	public static void main(String[] args) throws Exception {
			//log4j.logger.info("��������9999�˿�����");
		log4j.logger.info("��������9999�˿�����");
			ServerSocket ss=new ServerSocket(9999);
			
				Socket socket=ss.accept();
				//��ӡ������Ϣ
				String ip=socket.getInetAddress().getHostAddress();
				log4j.logger.info(ip+"�Ѿ�����");
				log4j.logger.info("�������ڲ���...");
				//�����������������ļ�
				InputStream in=socket.getInputStream();
				ObjectInputStream ois=new ObjectInputStream(in);
				sdate = (ArrayList<Environment>) ois.readObject();
				System.out.println(sdate.size());
				//�������ݿ�
				PreparedStatement ps=null;
				 Connection conn=DButil.getconnection();
				 //�ضϱ�
				 for(int i=1;i<32;i++) {
					 String sql="truncate table e_detail_"+String.valueOf(i);
					 ps=conn.prepareStatement(sql);
					 ps.execute();
				 }
				 Map<Integer, PreparedStatement> map=new HashMap<>();
				 for(int i=1;i<32;i++) {
					 String sql1="insert into e_detail_"+String.valueOf(i)+
							 "  values(?,?,?,?,?,?,?,?,?)";
					 map.put(i, conn.prepareStatement(sql1));
				 }
					 for(Environment s:sdate) {
//				    int time=Integer.valueOf((s.getTime()+"").substring(8, 10));
						 int time=getDay(s);
								 map.get(time).setString(1, s.getName());
								 map.get(time).setInt(2, s.getSrcId());
								 map.get(time).setInt(3, s.getDesId());
								 map.get(time).setInt(4, s.getSensorAddress());
								 map.get(time).setInt(5, s.getCounter());
								 map.get(time).setInt(6, s.getCmd());
								 map.get(time).setInt(7, s.getStatus());
								 map.get(time).setDouble(8, s.getData());
								 map.get(time).setTimestamp(9,s.getTime());
								 map.get(time).addBatch();			
					 }
					 for(int i=1;i<32;i++) {
						map.get(i).executeBatch();
						map.get(i).clearBatch();
						map.get(i).close();	 
					 }	 
					
					 DButil.close();
					 log4j.logger.info("�������");
			
		}

	private static int getDay(Environment env) {
		//��ȡ�·ݵ�ĳһ��
		Timestamp time = env.getTime();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}	
}
	