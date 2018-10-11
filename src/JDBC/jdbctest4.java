/**
 * 
 */
package JDBC;

import java.sql.ResultSet;

/**
 * @author daixuan
 *
 * 2018Äê9ÔÂ18ÈÕ
 */
public class jdbctest4 {
	public static void main(String[] args) {
		String sql="select last_name,id  from s_emp";
		String sql1="insert into student values(?,?,?)";
		DButil.dml(sql1,new Object[] {93,"shaj1",21});
		
		
		
		
	}

}
