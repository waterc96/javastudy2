package day_7_lei;

public class Student {
	private String name;
	private int age;
	private int score;
	private String country;

	private static Student INSTANCE = null;

	public static Student getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Student( 25," ",20);
		}
		return INSTANCE;
	}

	// ����ģʽ���������ֻ����һ���������
	private Student(int age ,String name,int socre) {
 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void study() {
		System.out.println("ѧϰJava");
	}

}
