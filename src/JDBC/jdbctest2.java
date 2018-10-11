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

import com.google.gson.Gson;

/**
 * @author daixuan
 *
 * 2018年9月17日
 */
public class jdbctest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "briup", "briup");
			Statement stu=conn.createStatement();
			String sql="select s_emp.id,last_name,avgsalary,salary,s_dept.name,s_region.name\r\n" + 
					"	from s_emp,s_dept,s_region,(select avg(salary)as avgsalary,dept_id as newdept_id from s_emp group by dept_id)\r\n" + 
					"	where salary>(select avg(salary)as avgsalary from s_emp group by dept_id,last_name having last_name='Ngao')\r\n" + 
					"	and avgsalary>(select avg(salary)as avgsalary from s_emp group by dept_id,last_name having last_name='Ngao')\r\n" + 
					"	and dept_id=newdept_id\r\n" + 
					"	and dept_id=s_dept.id\r\n" + 
					"	and s_dept.region_id=s_region.id";
			ResultSet res=stu.executeQuery(sql);
			List <Employee> emps=new ArrayList<>();
			StringBuilder sb=new StringBuilder();
			while(res.next()) {
				Employee emp=new Employee();
				emp.salary=res.getInt("salary");
				emp.dept_avsalary=res.getInt("avgsalary");
				emp.id=res.getInt("id");
				emp.name=res.getString("last_name");
				emp.bumengname=res.getString("name");
				emps.add(emp);
				Gson gson=new Gson();
				sb.append(gson.toJson(emp,Employee.class));
			}				
			for(Employee e:emps) {
				System.out.println(e.toString(e));
			}
			System.out.println(sb);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
class Employee{
	Integer dept_avsalary;
	Integer id;
	String name;
	Integer salary;
	String bumengname;
	
	public String toString(Employee e) {
		// TODO Auto-generated method stub
		return "部门名字："+e.bumengname+"部门平均工资："+e.dept_avsalary+"员工编号："
				+e.id+"员工姓名"+e.name+"员工工资:"+e.salary;
	}
}