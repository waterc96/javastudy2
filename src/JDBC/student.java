/**
 * 
 */
package JDBC;

/**
 * @author daixuan
 *
 * 2018Äê9ÔÂ17ÈÕ
 */
class student {
private String name;
private Integer id;
private Integer age;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the id
 */
public Integer getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Integer id) {
	this.id = id;
}
/**
 * @return the age
 */
public Integer getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(Integer age) {
	this.age = age;
}

public String toString(student s) {
	// TODO -generated method stub
	return s.getId()+","+s.getName()+","+s.getAge();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");

	}

}
