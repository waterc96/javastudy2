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
 * 2018��9��18��
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
			//ȡ���Զ��ύ
			conn.setAutoCommit(false);
			stmt=conn.createStatement();
		//	String sql="insert into student values(2,'tom1',31)";
			String sql1="update student set age=60";
		//	stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			//ִ�лع�����
			conn.rollback();
			//�ֶ��ύ
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
				//�ر�connection���󣬻��Զ��ύһ��
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
