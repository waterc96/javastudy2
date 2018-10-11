/**
 * 
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.google.gson.Gson;

import oracle.jdbc.OracleDriver;

/**
 * �������ݿ�����
 * @author daixuan
 * 2018��9��15��
 */
public class jdbctest1 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement ste=null;
		ResultSet rs=null;
		
		
		try {
		//�������ݿ�����
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			 �ڶ���
//			 OracleDriver driver=new OracleDriver();
//			  DriverManager.registerDriver(driver);
//			  ������		
			
			//URLָ��Ҫ���ʵ����ݿ���mydata
		    String url = "jdbc:oracle:thin:@localhost:1521:XE";
		    //MySQL����ʱ���û���
		    String muser = "briup";
		    //MySQL����ʱ������
		    String mpassword = "briup";
		  //��ȡ���Ӷ���conn
		    
		    
		   conn=DriverManager.getConnection(url,muser,mpassword);
		    System.out.println(conn);
		    //�ڶ��ֻ�ȡ���Ӷ���ķ�ʽ
//		    Properties properties=new Properties();
//		    properties.setProperty("user",muser);
//		    properties.setProperty("password",mpassword);
//		    Connection conn=DriverManager.getConnection(url,properties);
//		    System.out.println(conn);  
		    //����statement������ִ��sql���
		   ste=conn.createStatement();
		   delete(ste);
		   
		   
		   
		    String sql="select * from student";
		    //��ȡ�����
		    rs=ste.executeQuery(sql);
		    List<student> stus=new ArrayList<>();
		    StringBuilder  s=new StringBuilder();
		    while(rs.next()) {	
//			System.out.println(
//			rs.getInt("id")+","
//		    +rs.getString("name"+",")
//			+rs.getInt("age")
//			);
		//	System.out.println(rs.getObject(1)+rs.getObject(2)+rs.getObject(3));	
		    	student stu=new student();
		    	stu.setId(rs.getInt(1));
		    	stu.setName(rs.getString(2));
		    	stu.setAge(rs.getInt(3));
		    	stus.add(stu);	
	    	Gson gson =new Gson();
	    	s.append(gson.toJson(stu,student.class));
		    }
		    for(student s1:stus) {
	    		System.out.println(s1.toString(s1));
	    	}
	    	
		    System.out.println(s);
		    
		    
						
			
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}	
	
		
		

	}


	//ִ��insert���
	private static void insert(Statement stmt) throws SQLException {
	String sql="insert into student values(10,'tom10',33)";
	int num=stmt.executeUpdate(sql);
	 System.out.println("�޸���"+num+"��");
	}
	//ִ��update���
	private static void update(Statement stmt) throws SQLException {
		String sql="update student set age=20";
		 int num=stmt.executeUpdate(sql);
		 System.out.println("�޸���"+num+"��");
		}
	//delete����
	private static void delete(Statement stmt) throws SQLException {
		String sql="delete from student  where id=10";
		int num=stmt.executeUpdate(sql);
		 System.out.println("�޸���"+num+"��");
		}
}
