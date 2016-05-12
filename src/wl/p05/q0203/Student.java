package wl.p05.q0203;

public class Student implements Comparable<Student>{

	// Declare Instance variables
	private String adminNo;
	private String name;
	private Integer age;

	public Student(String name, String adminNo, Integer age) {
		this.adminNo = adminNo;
		this.name = name;
		this.age = age;
	}

	// ----------------------------------------------------------
	// Accessor methods to get and set attributes
	// ----------------------------------------------------------
	public String getAdminNo() {
		return adminNo;
	}

	public String getName() {
		return name;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " (" + adminNo  + ", Age: " + age + ")";
	}

	@Override
	public int compareTo(Student o) {
		if (name.equals(o.name)) {
			return age.compareTo(o.age);
		} else {
			return name.compareTo(o.name);
		}
	}
	
}
