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
 * 测试数据库连接
 * @author daixuan
 * 2018年9月15日
 */
public class jdbctest1 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement ste=null;
		ResultSet rs=null;
		
		
		try {
		//加载数据库驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			 第二种
//			 OracleDriver driver=new OracleDriver();
//			  DriverManager.registerDriver(driver);
//			  第三种		
			
			//URL指向要访问的数据库名mydata
		    String url = "jdbc:oracle:thin:@localhost:1521:XE";
		    //MySQL配置时的用户名
		    String muser = "briup";
		    //MySQL配置时的密码
		    String mpassword = "briup";
		  //获取连接对象conn
		    
		    
		   conn=DriverManager.getConnection(url,muser,mpassword);
		    System.out.println(conn);
		    //第二种获取连接对象的方式
//		    Properties properties=new Properties();
//		    properties.setProperty("user",muser);
//		    properties.setProperty("password",mpassword);
//		    Connection conn=DriverManager.getConnection(url,properties);
//		    System.out.println(conn);  
		    //创建statement对象，来执行sql语句
		   ste=conn.createStatement();
		   delete(ste);
		   
		   
		   
		    String sql="select * from student";
		    //获取结果集
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


	//执行insert语句
	private static void insert(Statement stmt) throws SQLException {
	String sql="insert into student values(10,'tom10',33)";
	int num=stmt.executeUpdate(sql);
	 System.out.println("修改了"+num+"行");
	}
	//执行update语句
	private static void update(Statement stmt) throws SQLException {
		String sql="update student set age=20";
		 int num=stmt.executeUpdate(sql);
		 System.out.println("修改了"+num+"行");
		}
	//delete操作
	private static void delete(Statement stmt) throws SQLException {
		String sql="delete from student  where id=10";
		int num=stmt.executeUpdate(sql);
		 System.out.println("修改了"+num+"行");
		}
}
