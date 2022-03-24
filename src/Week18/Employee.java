package Week18;

public class Employee {
	
	private int age;
	private String name;
	private String status;
	
	public Employee(String name, int age, String status) {
		this.name = name;
		this.age = age;
		this.status = status;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "[Name=" + name + ", Age=" + age + ", Status=" + status + "]";
	}

}
