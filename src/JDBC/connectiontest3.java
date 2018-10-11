/**
 * 
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author daixuan
 *
 * 2018��9��18��
 */
public class connectiontest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "briup", "briup");
			String sql="insert into student values(?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			//ʹ��executeBatch�ٶȿ�
			//����������������д����ݵĲ��������ܻᱨOutofmemory�ڴ����
			//if(i%10000==0){
			//	pstmt.executeBatch();
			//	pstmt.clearBatch();
			//}
			for (int i = 0; i < 10000; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "tom"+i);
				pstmt.setInt(3, i);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
			pstmt.clearBatch();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
