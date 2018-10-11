/**
 * 
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * @author daixuan
 *
 * 2018年9月17日
 */
public class jdbctest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "briup", "briup");
			Statement stu=conn.createStatement();
		
			String sql="insert into s_tt values(?,?,?,?,?)";
			//PreparedStatement res=conn.prepareStatement(sql);
			Statement st=conn.createStatement();
			String sql2="select * from s_tt";
			String sql3="alter table s_ttsalary ";
			//for(int i=1;i<=1000;i++) {
	//			String sql1="insert into s_tt values(1001,张三,1234,3000,93-3-3)";
//				res.setInt(1, i);
//				res.setString(2, "name"+i);
//				res.setString(3, "123456");
//				res.setInt(4, 5000);
//				res.setDate(5, new java.sql.Date(6, 6, 6));
				//res.execute(sql1);
				ResultSet res1=st.executeQuery(sql2);
				while(res1.next()) {
					int num=res1.getInt("id");
					String name=res1.getString("name");
					String password=res1.getString("passwd");
					int salary=res1.getInt("salary");
					Date date=res1.getDate("start_date");
					System.out.println(num+" "+name+" "+password+" "+salary+" "+date);
				}
				
		//	}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class tt{
	Integer id;
	String name;
	String password;
	Integer salary;
	String date;
}