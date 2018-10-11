/**
 * 
 */
package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Properties;



/**
 * @author daixuan
 *数据工具类
 * 2018年9月18日
 */
public class DButil {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static Connection connection;
	private static Statement stam;
	private static  PreparedStatement psm;
	private static ResultSet rs;
	public static void main(String[] args) {
		DButil u=new DButil();
	}
	static {
		Properties Properties=new Properties();
		try {
			Properties.load(DButil.class.getClassLoader()
					.getResourceAsStream("DBsource.properties"));
			driver=Properties.getProperty("driver");
			url=Properties.getProperty("url");
			username=Properties.getProperty("username");
			password=Properties.getProperty("password");
//			System.out.println(driver);
//			System.out.println(url);
//			System.out.println(username);
//			System.out.println(password);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//获取connection对象
	public static  Connection getconnection(){
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	//返回结果集
	public static ResultSet rs(String sql,Object...params) {
		getconnection();
		try {
			psm=connection.prepareStatement(sql);
			for(int i = 0; i < params.length; i++) {
				psm.setObject(i+1, params[i]);
			}
		rs=	psm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return rs;
		}
	
	
	
	/**
	 * 执行dml操作（insert update delete）
	 * */
	public static  int dml(String sql,Object...params) {
		getconnection();
		int num=0;
		try {
			PreparedStatement psm=connection.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				psm.setObject(i+1, params[i]);
			}
			num = psm.executeUpdate();
			System.out.println("修改了"+num+"行");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	return num;
		
	}
	public static void bouch(int x,String y )  {
		String sql="insert into student values(?,?,?)";
		try {
			psm=connection.prepareStatement(sql);
			for(int i=0;i<x;i++) {
				psm.setInt(1, i);
				psm.setString(2, y+i);
				psm.setInt(3, i);
				psm.addBatch();
				if(i%10000==0) {
					psm.executeBatch();
					psm.clearBatch();
				}
			}
			psm.executeBatch();
			psm.clearBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		}
	public static void close() {
		
		if(stam!=null) {
			try {
				stam.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(psm!=null) {
			try {
				psm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	}
 
