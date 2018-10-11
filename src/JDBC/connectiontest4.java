/**
 * 
 */
package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author daixuan
 *
 * 2018年9月18日
 */
public class connectiontest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "briup", "briup");
			//取消自动提交
			conn.setAutoCommit(false);
			stmt=conn.createStatement();
		//	String sql="insert into student values(2,'tom1',31)";
			String sql1="update student set age=60";
		//	stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			//执行回滚操作
			conn.rollback();
			//手动提交
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//关闭connection对象，会自动提交一次
			}if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
