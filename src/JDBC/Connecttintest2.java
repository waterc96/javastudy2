/**
 * 
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author daixuan
 *测试preparedstatement  是statement的子接口
 *1.预编译，提高效率
 *2.安全性较好（防止sql注入）
 *
 * 2018年9月18日
 */
public class Connecttintest2 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:XE", "briup", "briup");
			//使用占位符？来表示参数
			String sql=("select *from student where id<?");
			PreparedStatement prmt=conn.prepareStatement(sql);
			prmt.setInt(1, 5);//一表示第几个问号，2表示？代表的是啥。
			//prmt.setInt(1, 3);
			ResultSet rs=prmt.executeQuery();
			
			while(rs.next()) {
				System.out.println
				(rs.getObject(1)+":"+rs.getObject(2)+":"+rs.getObject(3));
			}
			//System.out.println(rs);
			//delete(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
private static void insert(Connection conn) throws SQLException {
	String sql="insert into student values(?,?,?)";
	PreparedStatement prsm=conn.prepareStatement(sql);
	prsm.setInt(1, 11);
	prsm.setString(2, "tom11");
	prsm.setInt(3, 110);
	int num=prsm.executeUpdate();
	 System.out.println("修改了"+num+"行");	
}
private static void update(Connection conn) throws SQLException {
	String sql="update student set age=?";
	PreparedStatement prsm=conn.prepareStatement(sql);
	prsm.setInt(1, 100);
	int num=prsm.executeUpdate();
	System.out.println("修改了"+num+"行");
}
@SuppressWarnings("unused")
private static void delete(Connection conn) throws SQLException {
	String sql="delete from student where id=?";
	PreparedStatement prsm=conn.prepareStatement(sql);
	prsm.setInt(1, 1);
	int num=prsm.executeUpdate();
	System.out.println("修改了"+num+"行");
}
}
